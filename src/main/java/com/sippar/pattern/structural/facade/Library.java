package com.sippar.pattern.structural.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    public String name;
    public String address;
    public List<Book> books = new ArrayList<>();
    public List<Client> clients = new ArrayList<>();
    public Map<Client, Book> rentedBooks = new HashMap<>();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addRentedBook(Book book, Client client) {
        rentedBooks.put(client, book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Client> getClients() {
        return clients;
    }

    public Map<Client, Book> getRentedBooks() {
        return rentedBooks;
    }
}
