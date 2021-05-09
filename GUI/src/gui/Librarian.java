/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.w3c.dom.css.Counter;

/**
 *
 * @author Lenovo
 */
public class Librarian {
     private String name;
     private String password;
      private String address;
    private int id;

    public Librarian(String name, String password, String address, String city, String email, String contactNo) {
        this.id=Reader.librarians.size()+1;
        this.name = name;
        this.password = password;
        this.address = address;
        this.city = city;
        this.email = email;
        this.contactNo = contactNo;
    }
  
       private String city;
        private String email;
         private String contactNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
         
}
