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
public class Fish extends Animal
{
    public Fish(int age, String color)
    {
        super(age, color);
    }
    
    @Override
    public void speak()
    {
        System.out.println("I make bubbles");
    }
    
}
