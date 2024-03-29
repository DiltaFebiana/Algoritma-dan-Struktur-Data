/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author HP
 */
import java.util.*;
public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Strawberry");
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        Collections.sort(fruits);
        
        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString() );
        
        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
       
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
