/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author mosta
 */
public class Reader {
   public static ArrayList<Librarian> librarians= new ArrayList<>();
   public static ArrayList<Student> students=new ArrayList<>();
   public static ArrayList<Book> books=new ArrayList<>();
   public static ArrayList<IssuedBooks> issued=new ArrayList<>();
   public static void LibrarianReader(ArrayList<Librarian> librarians){
      
       try {
            BufferedReader myObject = new BufferedReader(new FileReader("Librarian.txt"),16*1024);
            Scanner scanner = new Scanner(myObject);
             if(scanner.hasNext()){
          while (scanner.hasNextLine()) {
               String Line=scanner.nextLine();
               String[] token=Line.split(",");
                librarians.add(new Librarian(token[0],token[1],token[2],token[3],token[4],token[5]));
          }
          }
          myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
      
   }
    public static void BookReader(ArrayList<Book> books) {
        try {
            BufferedReader myObject = new BufferedReader(new FileReader("Books.txt"),16*1024);
            Scanner scanner = new Scanner(myObject);
            if(scanner.hasNext()){
          while (scanner.hasNextLine()) {
               String Line=scanner.nextLine();
               String[] token=Line.split(",");
               
                books.add(new Book(token[0],token[1],token[2],token[3],Integer.parseInt(token[4]),Integer.parseInt(token[5]),token[6]));
              
          }
        }
          myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        } 
      
    }
    public static void StudentReader(ArrayList<Student> students){
       try {
            BufferedReader myObject = new BufferedReader(new FileReader("Students.txt"),16*1024);
            Scanner scanner = new Scanner(myObject);
            if(scanner.hasNext()){
          while (scanner.hasNextLine()) {
               String Line=scanner.nextLine();
               String[] token=Line.split(",");
               
                students.add(new Student(token[0],token[1],token[2],token[3],token[4],token[5],Integer.parseInt(token[6]),Integer.parseInt(token[7])));
          }
        }
          myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        } 
    }
     public static void IssuedBooksReader(ArrayList<IssuedBooks> issued){
       try {
            BufferedReader myObject = new BufferedReader(new FileReader("IssuedBooks.txt"),16*1024);
            Scanner scanner = new Scanner(myObject);
            if(scanner.hasNext()){
          while (scanner.hasNextLine()) {
               String Line=scanner.nextLine();
               String[] token=Line.split(",");
               
                issued.add(new IssuedBooks(Integer.parseInt(token[0]),token[1],token[2],token[3],token[4],token[5]));
          }
        }
          myObject.close();
        }catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
}
