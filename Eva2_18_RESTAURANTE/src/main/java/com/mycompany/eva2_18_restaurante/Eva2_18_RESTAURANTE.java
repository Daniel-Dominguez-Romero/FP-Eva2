/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_18_RESTAURANTE {

    public static void main(String[] args) {
        
        int num, cant, total; 
        String menu[] = {"Dogos", "Hambuergesas", "Boneless", "Tacos", "Montados", "Camarones"}; 
        int precios[] = {50, 80, 120, 150, 70, 200}; 
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " +  menu[i] + " $" + precios[i]);
        }
                
        
        System.out.println("Cual es tu orden? (Introduce el numero del producto): ");
        Scanner captu = new Scanner(System.in);    
        num = captu.nextInt(); 
        captu.nextLine();
        System.out.println("Cuantas ordenes?: ");
        cant = captu.nextInt();
        captu.nextLine();
        
        total = cant * precios[num];
         
        System.out.println("El costo final es de: " + total);
        
        
        
        
        
        
        
        
        
    }
}
