package book;

import book.bo.Book;
import book.bo.Contact;
import book.bo.Gender;

public class App {


    public static void main(String[] args) {

        Contact contact = new Contact("Parra", "Adrien", "06.83.79.79.60", Gender.M);
        Contact contact2 = new Contact("Parra", "Adrien", "06.83.79.79.60", Gender.M);
        Book book = new Book();
        book.addContact(contact);
        book.addContact(contact2);
        System.out.println(book.getContacts().size());
//        System.out.println(contact.getGender().toString());
//        System.out.println(contact.getGender().getLabel());
    }
}
