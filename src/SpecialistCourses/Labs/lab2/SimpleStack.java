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
public class SimpleStack implements Stack{
//ссылочная переменная для массива элементов типа int
    private int[] array;
//индекс вершины стека
    private int top;
//всего элементов в стеке
    private int size;

//конструктор класса с параметром (n - максимальное кол-во элементов в стеке)

    public SimpleStack(int n) {
        array=new int[n];
        top=-1; //стек пустой
        size=n;
    }
           
    @Override
    public void push(int value) {
        if(top<size-1){
            array[++top]=value;
        } 
    }

    @Override
    public int pop() {
        if(top>=0){
            int v1=array[top];
            top--;
            return v1;
        }
        return top;
    }

    @Override
    public boolean isEmpty() {
//        if(top==-1){
//            return true;
//        }
//        return false;
        return (top==-1);
    }

    @Override
    public boolean isFull() {
        return (top==size-1);
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public void clear() {
        top=-1;
    }

//переопределили метод toString()    
    @Override
    public String toString(){
        String s="";
        for (int i = top; i >=0; i--) {
            s += String.format("%d",array[i]);
            if(i>0){ //Проверка: элемент не последний в стеке?
                s += ",";
            }
        }
        return s;
    }
//метод для ёмкости стека
//    @Override
//    public int getCapacity(){
//        return size;
//    }
//    
//    @Override
//    public int getElement(int index){
//        return array[index]; 
//    }
//         
//    @Override
//    public void setElement(int index, int value){
//        array[index] = value;
//    }
//    
//    @Override
//    public void setTop(int value){
//        top = value;
//    }
}
