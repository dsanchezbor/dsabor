/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3;

/**
 *
 * @author sanch
 */
public class Eva3_3 {

    public static void main(String[] args) {
        
        int v1 = calcularFactorial(5); 
        
    }
    
    public static int calcularFactorial(int num){
       int resu = 1;
       
       for (int i = 1; i <= num; i++) {
           resu *= i; //resu = resu * i;
       }
       return resu;
    }
    
    int v2 = calcularpotencia(5,4);
    //crear una funcion que calcule la potencia de un numero entero.
    public static int calcularpotencia(int base, int exp) {
        int resu = 1;
        for (int i = 0; i < exp; i++) {
            resu *= base;    
        }
        return resu;
    }
}
