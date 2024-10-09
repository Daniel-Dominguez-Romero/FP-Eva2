/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PRACTICA_1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        String text;
        int times;        
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el texto");
        text = captu.nextLine();
        System.out.println("Introduce el numero de veces que se repetira");
        times = captu.nextInt(); 
        captu.nextLine();
        
        for (int i = 1; i <= times; i ++) {
            System.out.println(text);
        
        
        }
    }
}
