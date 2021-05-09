/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author mosta
 */
public class IssuedBooks {
    private String bookCallno;
    private String studentid;
    private String studentName;
    private  String studentContact;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private  int id;
    private static int counter;
    public IssuedBooks(String bookCallno, String studentid,String studentName, String studentContact) {
     
        this.id=Reader.issued.size()+1;
        this.bookCallno = bookCallno;
        this.studentid = studentid;
        this.studentName=studentName;
        this.studentContact = studentContact;
        this.issueDate = LocalDate.now();
        this.returnDate=LocalDate.now().plusDays(2);
    }
    public IssuedBooks(int id,String bookCallno, String studentid,String studentName, String studentContact, String issueDate) {
        this.id=id;
        this.bookCallno = bookCallno;
        this.studentid = studentid;
        this.studentName=studentName;
        this.studentContact = studentContact;
        this.issueDate = LocalDate.parse(issueDate);
        this.returnDate=LocalDate.parse(issueDate).plusDays(2);
    }

    public String getBookCallno() {
        return bookCallno;
    }

    public void setBookCallno(String bookCallno) {
        this.bookCallno = bookCallno;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    }

    

