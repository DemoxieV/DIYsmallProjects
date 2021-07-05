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
public class Student extends Person{
    // 1.Студент является персоной? Is-A (Student extends Person)
    // 2.Студент содержит персону(объект типа персон)? Has-A (свойство)
    
    //свойства: каждый студент может учиться только в одном институте
    private Institute inst;
    //для каждого существует текущий средний балл успеваемости
    //средний балл в диапазоне от 1 до 5
    private int averagemark;
    private boolean status; 
    //private Person human;
    
    public Student(Institute i, int a, boolean st, String h){
        super(h);
        inst=i;
        averagemark=a;
        status=st;
        //human=h;
    }
    
    
    public Institute getInstitute(){
        return inst;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setAverageMark(int avgmark){
        averagemark = avgmark;
    }
    
    public int getAverageMark(){
        return averagemark;
    }
    
//    public void setPerson(Person h){
//        human=h;
//    }
//    
//    public Person getPerson(){
//        return human;
//    }

    public void setInst(Institute inst) {
        this.inst = inst;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}

