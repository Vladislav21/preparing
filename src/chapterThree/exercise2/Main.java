package chapterThree.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstName("Владислав");
        author1.setLastName("Чунихин");
        Author author2 = new Author();
        author2.setFirstName("Александр");
        author2.setLastName("Михель");
        Author author3 = new Author();
        author3.setFirstName("Алексей");
        author3.setLastName("Бузин");
        Author author4 = new Author();
        author4.setFirstName("Дмитрий");
        author4.setLastName("Суровикин");
        Author author5 = new Author();
        author5.setFirstName("Яна");
        author5.setLastName("Иванова");
        List<Author> authors = new ArrayList<>();
        authors.add(0,  author1);
        authors.add(1,  author2);
        authors.add(2,  author3);
        authors.add(3,  author4);
        authors.add(4,  author5);
        System.out.println("Список авторов: "+authors);
        Book book1 = new Book(1,"Колобок", author1,"Vesta",25,345,45.34);
        Book book2 = new Book(1,"Долина", author1,"TLT",55,500,55.34);
        Book book3 = new Book(1,"Страх", author4,"Samara",35,125,54);
        Book book4 = new Book(1,"Рагозин", author4,"MSK",15,1455,135.77);

        List<Book> books = new ArrayList<>();
        books.add(0,book1);
        books.add(1,book2);
        books.add(2,book3);
        books.add(3,book4);
        System.out.println("Список книг: "+books);

        System.out.println("Книги с первым автором: "+ getBooksWithAuthor1(books));

    }
    static public List<Book> getBooksWithAuthor1(List<Book> books){
        List<Book> newbooks = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().getFirstName().equals("Владислав")){
                newbooks.add(book);
            }
        }
        return newbooks;
    }
}
