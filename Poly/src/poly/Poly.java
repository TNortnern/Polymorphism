/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.util.ArrayList;

/**
 *
 * @author tn0786647
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Dog aDog = new Dog(50, "Brown");
        Lion aLion = new Lion(15, "Gold");
        Fish aFish = new Fish(3, "Blue");
//        aDog.speak();
//        aFish.speak();
//        aLion.speak();
//        animalSpeak(aLion);
//        animalSpeak(aFish);
//        animalSpeak(aDog);
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        aryAnimal.add(aDog);
        aryAnimal.add(aLion);
        aryAnimal.add(aFish);
        for (int i = 0; i < aryAnimal.size(); i++)
        {
            animalSpeak(aryAnimal.get(i));
//            anDisplay(aryAnimal.get(i));
            
        }
        
    }
    
//    public static void lionSpeak(Lion lion)
//    {
//        lion.speak();
//    }
//    public static void fishSpeak(Fish fish)
//    {
//        fish.speak();
//    }
//    public static void dogSpeak(Dog dog)
//    {
//        dog.speak();
//    }
     public static void animalSpeak(Animal animal)
    {
        animal.speak();
    }
     
//     public static void anDisplay(Animal animal)
//     {
//         animal.display();
//     }
}
