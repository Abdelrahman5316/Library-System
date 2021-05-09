/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author mosta
 */
public class Writer {
    
    
    public static void LibrarianWriter(ArrayList<Librarian> librarians){
        int i;
        try {
            FileWriter myObject = new FileWriter("Librarian.txt");
for(i=0;i<librarians.size();i++){
       myObject.write(librarians.get(i).getName());
       myObject.write(",");
       myObject.write(librarians.get(i).getPassword());
       myObject.write(",");
        myObject.write(librarians.get(i).getAddress());
       myObject.write(",");
        myObject.write(librarians.get(i).getCity());
       myObject.write(",");
        myObject.write(librarians.get(i).getEmail());
       myObject.write(",");
        myObject.write(librarians.get(i).getContactNo());
       myObject.write("\r");
}
myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
       public static void BookWriter(ArrayList<Book> books){
            int i;
        try {
            FileWriter myObject = new FileWriter("Books.txt");
for(i=0;i<books.size();i++){
     //  myObject.write(Integer.toString(i+1));
     //  myObject.write(",");
       myObject.write(books.get(i).getCallNo());
       myObject.write(",");
       myObject.write(books.get(i).getName());
       myObject.write(",");
        myObject.write(books.get(i).getAuthor());
       myObject.write(",");
        myObject.write(books.get(i).getPublisher());
       myObject.write(",");
        myObject.write(Integer.toString(books.get(i).getQuantity()));
       myObject.write(",");
        myObject.write(Integer.toString(books.get(i).getIssuedBooks()));
         myObject.write(",");
        myObject.write(Reader.books.get(i).getAddedDate());
       myObject.write("\r");
}
myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
       }
       public static void StudentWriter(ArrayList<Student> students){
                  int i;
        try {
            FileWriter myObject = new FileWriter("Students.txt");
for(i=0;i<students.size();i++){
     //  myObject.write(Integer.toString(i+1));
     //  myObject.write(",");
       myObject.write(students.get(i).getStudentName());
       myObject.write(",");
       myObject.write(students.get(i).getStudentPassword());
       myObject.write(",");
        myObject.write(students.get(i).getStudentEmail());
       myObject.write(",");
        myObject.write(students.get(i).getAddress());
       myObject.write(",");
        myObject.write(students.get(i).getCity());
       myObject.write(",");
        myObject.write(students.get(i).getStudentcontact());
       myObject.write(",");
        myObject.write(Integer.toString(students.get(i).getNumberOfBooks()));
         myObject.write(",");
        myObject.write(Integer.toString(students.get(i).getId()));
       myObject.write("\r");
}
myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
       }
       public static void IssuedBooksWriter(ArrayList<IssuedBooks> issued){
                 int i;
        try {
            FileWriter myObject = new FileWriter("IssuedBooks.txt");
for(i=0;i<issued.size();i++){
     //  myObject.write(Integer.toString(i+1));
     //  myObject.write(",");
       myObject.write(Integer.toString(issued.get(i).getId()));
       myObject.write(",");
       myObject.write(issued.get(i).getBookCallno());
       myObject.write(",");
        myObject.write(issued.get(i).getStudentid());
       myObject.write(",");
        myObject.write(issued.get(i).getStudentName());
         myObject.write(",");
        myObject.write(issued.get(i).getStudentContact());
         myObject.write(",");
        myObject.write(issued.get(i).getIssueDate().toString());
       myObject.write("\r");
}
myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        } 
       }
       
    }    

