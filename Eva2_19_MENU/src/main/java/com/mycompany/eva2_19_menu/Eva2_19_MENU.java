/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_19_MENU {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String menu[]; 
        int precios[]; 
        Scanner captu = new Scanner(System.in);        
        int cant; 
        
        System.out.println("Cuantos productos va tener el menu? ");
        cant = captu.nextInt(); 
        captu.nextLine(); 
        
        menu = new String [cant]; //tamano a los arreglos (cant) 
        precios = new int [cant]; 
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nombre del producto: ");
            menu[i] = captu.nextLine(); 
            System.out.println("Precio: ");
            precios[i] = captu.nextInt(); 
            captu.nextLine(); 
            
            
        }
        
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " +  menu[i] + " $" + precios[i]);
        }
        
        
        
        
    }
}
