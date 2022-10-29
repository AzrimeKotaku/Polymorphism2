/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism2;

/**
 *
 * @author USER
 */
public class KpopFans extends Fans {
    
    public KpopFans(){
        
    }
    
    public KpopFans(String name){
       this.setName(name);
    }
    
    
    
    public void watchingPerformance(Musician musician, String expression){
        System.out.print(getName() + " : ");
        System.out.print(expression + " melihat idolanya");
        musician.perform();
    }
}
