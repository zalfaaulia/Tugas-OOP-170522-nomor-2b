/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_oop_170522_2b;

/**
 *
 * @author Lenovo X380 Yoga
 */
public class Room {
    double panjang;
    double lebar;
    
    Room(double p, double l){
        panjang = p;
        lebar = l;
    }
    
    final double area(){
        return panjang * lebar;
    }
    
}
