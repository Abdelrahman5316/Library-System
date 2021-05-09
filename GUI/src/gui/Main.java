/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args){
    Reader.LibrarianReader(Reader.librarians);
   Reader.BookReader(Reader.books);
   Reader.StudentReader(Reader.students);
   Reader.IssuedBooksReader(Reader.issued);
       new HomeFrame().setVisible(true);  
    }
}
