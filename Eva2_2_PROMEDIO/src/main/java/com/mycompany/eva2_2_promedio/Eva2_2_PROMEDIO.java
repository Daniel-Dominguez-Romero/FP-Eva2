/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_2_PROMEDIO {

    public static void main(String[] args) {
        
        
        int califa,acum; 
        Scanner captu = new Scanner(System.in); 
        acum = 0;
        for(int i = 1; i <= 20; i++) {
            System.out.println("Estudiante #" + i);
            System.out.println("Introduce tu calificacion: "); 
        califa = captu.nextInt(); 
        captu.nextLine();
        acum = acum + califa; 

              
            
        }
    System.out.println("acum = " + acum);
    System.out.println("promedio = " + (acum / 20.0)); 
    }
}
