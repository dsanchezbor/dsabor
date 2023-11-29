/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6;

/**
 *
 * @author sanch
 */
public class Eva3_6 {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("El valor de x en el main es " + x);
        sumarValor(x);
        System.out.println("El valor de x despues de llamar a sumarValor es " + x);
    }
    public static void sumarValor(int valor){
        System.out.println("El valor recibido en sumarValor es " + valor);
        valor++;
        System.out.println("El valor modificado es " + valor);
        
        
    }
}
