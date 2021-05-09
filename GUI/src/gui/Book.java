/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Book {
     private String callNo;
      private String name;
     private String addedDate;
     private String author;
        private String publisher;
         private int quantity;
          private int issuedBooks;
    public Book(String callNo, String name,  String author, String publisher ,int quantity){
        DateFormat dateFormat=new SimpleDateFormat("dd-MM-YY HH:mm:ss");
        Date date =new Date();
      String dd=dateFormat.format(date);
       this.callNo = callNo;
        this.name = name;
        this.addedDate = dd;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issuedBooks=0;
    }      
    public Book(String callNo, String name,  String author, String publisher ,int quantity,int issuedBooks,String addedDate) {
        
        this.callNo = callNo;
        this.name = name;
        this.addedDate = addedDate;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issuedBooks=issuedBooks;
    }
   
     

    public String getCallNo() {
        return callNo;
    }    

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public int getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(int issuedBooks) {
        this.issuedBooks = issuedBooks;
    }
    
}
