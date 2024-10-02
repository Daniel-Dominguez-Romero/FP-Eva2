/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_ciclos;

/**
 *
 * @author danie
 */
public class Eva2_1_CICLOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    //CICLO FOR --> CUANDO SABEMOS CUANTAS VECES SE REPITE LA INSTRUCCION 
    //FUNCIONA COMO UN CONTADOR: INCIO, FIN   (condicion) Y SALTO EN EL CONTEO 
    
    //i --> index --> indice 
    //vamos a repetir 10 veces, Contando del 1 al 10 
    //NOSOSTROS ESTABLECEMOS EL PUNTO DE INICIO Y DE FIN 
    for(int i = 1; i <= 10; i++) {
        System.out.print(i + " - ");
    }
    System.out.println(""); 
    for(int i = 10; i >= 1; i--) {
        System.out.print(i + " - ");
    }
    }
}
