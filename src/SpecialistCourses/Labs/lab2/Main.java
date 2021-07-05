/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialistCourses.Labs.lab2;

/**
 *
 * @author DemoxieV
 */
public class Main {
    public static void main(String[] args) {
        Stack s1 = new SimpleStack(6);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        String str1=s1.toString();
        System.out.println(str1);
        Stack s2=StackUtil.createStack(s1);
        System.out.println(s2.toString());
    }
}
