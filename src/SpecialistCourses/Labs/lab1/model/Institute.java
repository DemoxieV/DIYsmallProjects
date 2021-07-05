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
public class Institute {
    //свойства: уникальный код, полное наименование, адрес
    //количество институтов ограничено - множество уникальных кодов
    //public static final String instcode="1506";
    private String instcode;
    private String iname;
    private Address iaddress;
    
    public Institute(String ic){
        instcode=ic;
    }

    public Institute() {
    }
    
    public Institute(String iname, Address iaddress) {
        this.iname = iname;
        this.iaddress = iaddress;
    }
    
    public String getInstCode(){
        return instcode;
    }

    public String getIname() {
        return iname;
    }

    public Address getIaddress() {
        return iaddress;
    }

//    public void setInstcode(String instcode) {
//        this.instcode = instcode;
//    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public void setIaddress(Address iaddress) {
        this.iaddress = iaddress;
    }
    
}
