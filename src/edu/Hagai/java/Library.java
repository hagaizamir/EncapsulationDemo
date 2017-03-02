package edu.Hagai.java;

import java.util.ArrayList;

/**
 * Created by Android2017 on 2/28/2017.
 */
public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public  Library (){

    }
    void  addBook (Book b){
        books.add(b);
    }

    //getAllBooks // printAllBooks
    void  printBooks (){
        for (Book b : books){
            System.out.println(b.getName());
            System.out.println(b.getISBN() + "\n\n");

        }
    }

    //getBooks
    public ArrayList<Book> getBooks() {
        return books;
    }

}
