package XMLSerialization.DOMParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;


public class DomExample {
    public static void main(String[] args) {
        try {
            //Create File
            File fXmlFile = new File("C:\\Users\\Владислав\\IdeaProjects\\Mikhel\\preparing\\src\\BookCatalog.xml");
            //Create BuilderFactory
            DocumentBuilderFactory docBuild = DocumentBuilderFactory.newInstance();
            //Создание построителя документа
            DocumentBuilder dBuilder = docBuild.newDocumentBuilder();
            //Создаем дерево DOM нодов из файла
            Document doc = dBuilder.parse(fXmlFile);
            //Получение корневого элеента
            /*addNewBook(doc);*/
            deleteNode(doc, "Author");
            readBooks(doc);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBooks(Document doc) {
        Node root = doc.getDocumentElement();
        System.out.println("List of books:\n");
        NodeList books = root.getChildNodes();
        for (int i = 0; i < books.getLength(); i++) {
            Node book = books.item(i);
            if (book.getNodeType() != Node.TEXT_NODE) {
                NodeList bookProps = book.getChildNodes();
                for (int j = 0; j < bookProps.getLength(); j++) {
                    Node bookProp = bookProps.item(j);
                    if (bookProp.getNodeType() != Node.TEXT_NODE) {
                        System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());
                    }
                }
                System.out.println("-------------------------------------");
            }
        }
    }

    private static void addNewBook(Document doc) {
        Node root = doc.getDocumentElement();
        Element book = doc.createElement("Book");
        Element title = doc.createElement("Title");
        title.setTextContent("Khife");
        Element author = doc.createElement("Author");
        author.setTextContent("Petr Second");
        Element cost = doc.createElement("Cost");
        cost.setTextContent("467");
        cost.setAttribute("Currency", "RUB");
        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(cost);
        root.appendChild(book);
        writeDocument(doc);
    }

    private static void writeDocument(Document doc) {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Владислав\\IdeaProjects\\Mikhel\\preparing\\src\\BookCatalog.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (FileNotFoundException | TransformerException e) {
            e.printStackTrace();
        }
    }

    private static void deleteNode(Document doc, String nameTag) {
        Node item = doc.getElementsByTagName(nameTag).item(0);
        item.getParentNode().removeChild(item);
        doc.normalize();
        try {
            prettyPrint(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void prettyPrint(Document xml) throws Exception {
        Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        Writer out = new StringWriter();
        tf.transform(new DOMSource(xml), new StreamResult(out));
        System.out.println(out.toString());
    }

}
