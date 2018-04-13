package XMLSerialization.JAXBParser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            Book book = new Book();
            book.setTitle("Basic");
            marshaller.marshal(book,System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
