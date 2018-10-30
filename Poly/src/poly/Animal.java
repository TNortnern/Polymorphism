/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author tn0786647
 */
public abstract class Animal 
{
    String color;
    int age;
    
    
    public Animal(int age, String color)
    {
        this.age = age;
        this.color = color;
        
    }
    
    public void display()
    {
        System.out.printf("I am %d and I'm %s\n ", age, color);
    }
    
    public abstract void speak();

    
}

