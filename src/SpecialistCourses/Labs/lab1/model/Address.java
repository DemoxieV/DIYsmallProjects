/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialistCourses.Labs.lab1.model;

/**
 *
 * @author DemoxieV
 */
public class Address {
    //свойства класса: название и почтовый код
    private String title;
    private int postcode;

    public Address(String title, int postcode) {
        this.title = title;
        this.postcode = postcode;
    }
        
    public String getTitle() {
        return title;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }
    
    
}
