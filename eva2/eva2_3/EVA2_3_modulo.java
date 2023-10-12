/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_3_modulo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int valor, residuo;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce el valor a evaluar");
        valor = input.nextInt();
        
        residuo = valor % 2; //% modulo --> residuo
        if(residuo == 0) //valor es par
                System.out.println("El valor es par");
                else 
                System.out.println("El valor es impar");
    }
}
