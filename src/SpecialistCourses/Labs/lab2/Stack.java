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
public interface Stack {
//Методы интерфейса:
    
//поместить число в стек (вершина стека перемещается на новый элемент)
    void push(int value);
    
//извлечь число с вершины стека (вершина стека перемещается на новый элемент)
    int pop();    
    
// проверяет, есть ли еще элементы в данном стеке (если в стеке,  нет ни одного элемента, то метод возвращает значение равное true)               
    boolean isEmpty();          
    
// проверяет, что стек уже заполнен (если нет возможности помещать новые элементы в стек, то метод возвращает значение равное true)
    boolean isFull();      
    
// возвращает количество элементов в стеке на текущий момент            
    int size();        
    
// удаляет все элементы из стека (очистка стека)                    
    void clear(); 
    
//    int getCapacity();
//    
//    int getElement(int index);
//    
//    void setElement(int index, int value);
//    
//    void setTop(int value);
}
