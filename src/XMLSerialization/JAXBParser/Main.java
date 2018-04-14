package XMLSerialization.JAXBParser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;

public class Main {
    private static final String FILE_NAME = "learningXML.xml";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        Book book = new Book();
        book.setTitle("Basic");
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(book, file);
            marshaller.marshal(book, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
