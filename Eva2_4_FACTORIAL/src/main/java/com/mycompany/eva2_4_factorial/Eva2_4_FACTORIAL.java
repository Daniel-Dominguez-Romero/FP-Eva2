/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_4_FACTORIAL {

    public static void main(String[] args) {
        
        
        
        int num; 
        Scanner captu = new Scanner(System.in);    
        System.out.println("Introduce un numero: ");
        num = captu.nextInt(); 
        captu.nextLine(); 
        int acum = 1; 
        
        for (int i = num; i >= 1; i --) {
           acum = acum*i; 
                
        }
        
        System.out.println("El factorial es: " + acum);
        
    }
}
