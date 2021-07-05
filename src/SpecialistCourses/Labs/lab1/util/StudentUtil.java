/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialistCourses.Labs.lab1.util;
import SpecialistCourses.Labs.lab1.model.*;
import java.util.ArrayList;

/**
 *
 * @author DemoxieV
 */
public class StudentUtil {
    public static boolean studentsOf(Student[] array, String iCode){
        for (int i = 0; i < array.length; i++) {
            if(array[i].getInstitute().getInstCode()!=iCode){
                return false;
            }
        }
        return true;
    }
    public static Student[] currentlyStudying(Student[] array){
        ArrayList <Student> arrayList = new ArrayList<Student>();
        for (int i = 0; i < array.length; i++) {
            if(array[i].getStatus()){
                arrayList.add(array[i]);
            }            
        }
        Student[] arrRes={};
        arrRes=arrayList.toArray(new Student[arrayList.size()]);
        return arrRes;
    }
    public static String createProgressReport(Student[] array){
        String text="------------------------\n";
        text+="|             | Оценка |\n";
        text+="------------------------\n";
        for (int i = 0; i < array.length; i++){
            text+=String.format("| %11s | %6d |\n",
                    array[i].getLastName(),
                    array[i].getAverageMark());
            text+="------------------------\n";
        }
        return text;
    }
}
