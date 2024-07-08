package com.sippar.pattern.structural.facade;

import java.util.List;
import java.util.Map;

public class Facade {
    private Book book;
    private Client client;
    private Library library = new Library("Central Library", "Central Park");

    private int counter = 0;
    public void registerBook(String title, String author, String publisher) {
        book = new Book(title, author, publisher);
        library.addBook(book);
    }

    public void registerClient(String name, String email) {
        client = new Client(++counter, name, email);
        library.addClient(client);
    }

    public void rentBook(String title, String author, int id) {
        //find book in list of books with title and author
        Book rent = null;
        for (Book book : library.getBooks()) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                rent = book;
            }
        }

        Client renter = null;
        for (Client client : library.getClients()) {
            if (client.getId() == id) {
                renter = client;
            }
        }

        if(rent!=null && renter!=null){
            library.addRentedBook(rent, renter);
        }
    }

    public List<Book> getBooks() {
        return library.getBooks();
    }

    public List<Client> getClients() {
        return library.getClients();
    }

    public Map<Client, Book> getBookMap() {
        return library.getRentedBooks();
    }

}
