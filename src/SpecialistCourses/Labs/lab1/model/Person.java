/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialistCourses.Labs.lab1.model;;

/**
 *
 * @author DemoxieV
 */
public class Person {
    //Запрет неследования: public final class Person
    
    //свойства класса: ФИО, возраст
    private String name;
    private String lastname;
    private String patronymic;
    private int age;
    //каждый проживает по определенному адресу
    private Address adr;
    
    public Person(String ln){
        lastname=ln;
    }

    public Person(String name, String lastname, String patronymic) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public Person(int age, Address adr) {
        this.age = age;
        this.adr = adr;
    }
    
    
    public String getLastName(){
        return lastname;
    }
    
    public void setLastName(String ln){
        lastname=ln;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public Address getAdr() {
        return adr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }
    
}
