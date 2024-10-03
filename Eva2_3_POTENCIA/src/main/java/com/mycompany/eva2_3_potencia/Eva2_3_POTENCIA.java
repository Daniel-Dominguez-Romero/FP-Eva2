/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_3_POTENCIA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        int base, expo;
        Scanner captu = new Scanner(System.in);        
        System.out.println("Introduce la base: "); 
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Introduce el exponente: ");
        expo = captu.nextInt(); 
        captu.nextLine(); 
        int acum = 1;
        for (int i = 1; i<= expo; i ++) {
            acum = acum * base; 
        }
        //System.out.println("potencia = " + Math.pow(base,, expo)); 
        
                
        System.out.println("La potencia es: " + acum);         
        
        
    }
}
