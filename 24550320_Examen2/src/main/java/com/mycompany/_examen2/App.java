/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._examen2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class App {

    public static void main(String[] args) {
        
        int piedra = 1;
        int papel = 2;
        int tijera = 3; 
        int jugada = 1;
        int robot; 
        int robot2;
        double f = Math.random(); 
        
        
            
        do{
            
        Scanner captu = new Scanner(System.in);        
        System.out.println("Las opcines son: 1. PIEDRA, 2. PAPEL, 3. TIJERA");
        System.out.println("Escribe el Numero correspondiente de tu jugada: " );
        jugada = captu.nextInt();
        captu.nextLine(); 
        
        
         if (f >= .6 ) {
             robot = 3;//TIJERA
             System.out.println("LA COMPUTADORA DIJO TIJERA");
             
         }else if (f <= .3){
             robot = 2; //PAPEL 
             System.out.println("LA COMPUTADORA DIJO PAPEL");
         }else if(f >= .3 && f <= .6){
             robot = 1; //PIEDRA 
             System.out.println("LA COMPUTADORA DIJO PIEDRA");
                    
         }
         
         if (jugada == 1 && robot == 2){
                
            System.out.println("LA COMPUTADORA GANO");
            
        }else if (jugada == 1 && robot == 1){
            System.out.println("EMPATE");        
        }else if (jugada == 1 && robot == 3){
             System.out.println("TU GANASTE");
        }else if (jugada == 2 && robot == 1){
             System.out.println("TU GANASTE");
        }else if (jugada == 2 && robot == 2){
             System.out.println("EMPATE");
        }else if (jugada == 2 && robot == 3) {
             System.out.println("LA COMPUTADORA GANO");
        }else if (jugada == 3 && robot == 1){
             System.out.println("LA COMPUTADORA GANO");
        }else if (jugada == 3 && robot == 2){
             System.out.println("TU GANASTE ");
        }else if (jugada == 3 && robot == 3){ 
             System.out.println("EMPATE");
        }
      
         
        
        }
      while (jugada > 3 || jugada < 1);
        

        
        
        
        
        
    }
}
