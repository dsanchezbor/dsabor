/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7;

/**
 *
 * @author sanch
 */
public class Eva3_7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arreglo = new int[10];
        System.out.println("El valor del arreglo en el main " + arreglo);
        llenarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
            
        }
    }
    public static void llenarArreglo(int[] valores) {
        System.out.println("El valor del arreglo en llenarArreglo es " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
            
        }
    }
           
}
