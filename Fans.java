/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism2;

/**
 *
 * @author USER
 */
public class Fans {
    private String name;
    
    public Fans(){
        this.name = "noname";
    }
    
    public Fans(String name){
       this.name = name;
    }
    
    public void showName(){
        
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return name;
    }
   
    void watchingPerformance() {
        System.out.println(name + " : Melihat idolanya dari Youtube");
    }

    void watchingPerformance(Musician musician) {
        System.out.print(name + " : Melihat idolanya");
        musician.perform();
    }
    
     
    
}
