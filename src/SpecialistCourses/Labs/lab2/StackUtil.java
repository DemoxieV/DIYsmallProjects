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
public class StackUtil {
    public static Stack createStack(Stack s){
        Stack sres=new SimpleStack(s.size());
        while(!s.isEmpty()){
            int v=s.pop();
            sres.push(v);
        }
        return sres;
//        Stack sres=new SimpleStack(s.getCapacity());
//        int t=s.size()-1;
//        for (int i = 0; i < s.size(); i++) {
//            sres.setElement(t-i,s.getElement(i));            
//        }
//        sres.setTop(t);
//        return sres;
        
    } 
    
}
