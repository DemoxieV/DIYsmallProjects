/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialistCourses.Labs.lab1.util;
import SpecialistCourses.Labs.lab1.model.*;
/**
 *
 * @author DemoxieV
 */
public class Main {
    public static final String MSU="1506";
    public static void main(String[] args) {
        Institute inst1=new Institute(MSU);
//        Person ps1=new Person("Иванов");
//        Person ps2=new Person("Петров");
//        Person ps3=new Person("Сидоров");
//        Person ps4=new Person("Смирнов"); 
        Student[] stds=new Student[]{
            //Institute i, int a, boolean st, Person h
            new Student(inst1,3,true,"Иванов"),
            new Student(inst1,4,true,"Петров"),
            new Student(inst1,5,true,"Сидоров"),
            new Student(inst1,5,false,"Смирнов")
            };
        System.out.println("Результат метода№1: "+ StudentUtil.studentsOf(stds, inst1.getInstCode()));
//        System.out.println("Результат метода№1: "+StudentUtil.studentsOf(stds, Institute.instcode));
        
        Student[] stdres=StudentUtil.currentlyStudying(stds);
        System.out.println("Результат метода№2:");
        for (int i = 0; i < stdres.length; i++) {
            System.out.println(stdres[i].getLastName());
        }
        
        System.out.println("Результат метода№3:\n"+StudentUtil.createProgressReport(stds));
    }
}
