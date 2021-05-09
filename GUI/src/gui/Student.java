/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author mosta
 */
public class Student {
    private String studentName;
    private String studentPassword;
    private String studentEmail;
    private String studentcontact;
    private int numberOfBooks;
    private String address;
    private String city;
    private int id;
    public static int selectedStudent;
 public Student(String studentName, String studentPassword,String studentEmail,String address,String city ,String studentcontact) {
        this.studentName = studentName;
        this.studentPassword=studentPassword;
        this.studentEmail = studentEmail;
        this.address=address;
        this.city=city;
        this.studentcontact = studentcontact;
        this.numberOfBooks = 3;
        this.id=Reader.students.size()+1;
    }
    public Student(String studentName, String studentPassword,String studentEmail,String address,String city ,String studentcontact,int numberOfBooks,int id) {
        this.studentName = studentName;
        this.studentPassword=studentPassword;
        this.studentEmail = studentEmail;
        this.address=address;
        this.city=city;
        this.studentcontact = studentcontact;
        this.numberOfBooks = numberOfBooks;
        this.id=id;
    }

    

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentcontact() {
        return studentcontact;
    }

    public void setStudentcontact(String studentcontact) {
        this.studentcontact = studentcontact;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    
  
    
}
