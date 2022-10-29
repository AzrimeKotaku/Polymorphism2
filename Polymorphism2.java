/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polymorphism2;

/**
 *
 * @author USER
 */
public class Polymorphism2 {

    public static void main(String args[]){
        
        Fans fans1 = new Fans();
        Fans fans2 = new Fans("Mona"); 
        Fans fans3 = new KpopFans("Tomi");
        KpopFans fans4 = new KpopFans("Febi");
        
        fans1.watchingPerformance();
        fans2.watchingPerformance(new Musician());
        fans2.watchingPerformance(new Singer());
        fans3.watchingPerformance(new Biduan());
        fans4.watchingPerformance(new Kpop(), "teriak histeris");
    }
}
