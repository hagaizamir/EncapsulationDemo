package edu.Hagai.java;

import java.awt.*;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library lib = new Library();

        Point p1 = new Point( 20,40);
        Point p2 = new Point();//P1


//        lib.addBook(new Book("Java time","4589-5896"));
//
//        //pointer
//        //objects are passed by reference
//        ArrayList <Book> books = lib.getBooks();

//        String uid = UUID.randomUUID().toString();
//        System.out.println(uid);

        //init 2 books
        Book b1 = new Book( " Java Software solutions 8th edition" , "212310 - 2392");
        Book b2 = new Book("Java in a nutshell 6th edition" , "4090923 - 023039");

//        lib.addBook(new Book( " Java Software solutions 8th edition" , "212310 - 2392"));
//        lib.addBook(new Book("Java in a nutshell 6th edition" , "4090923 - 023039"));

        //add the books to the libaray
        lib.addBook(b1);
        lib.addBook(b2);

        //print the books in the libraray
        lib.printBooks();



        //secure the integrity
        // will work as advertised

        //primitive value type
        // int , char, boolean, double , float
        //passed via copy

        //reference type object
        // capital letter only - Classes only
        //string///person///student///trivia///random///-> new
        //passed via reference. the receiver gets a reference , not a copy!
    }
}
