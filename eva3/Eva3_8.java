/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8;

/**
 *
 * @author sanch
 */
public class Eva3_8 {

    public static void main(String[] args) {
      Persona perso1 = new Persona ();
      //Scanner input = new Scanner(System.in);
      //int [] arreglo = new int[5];
        System.out.println(perso1);
        perso1.nombre = "el mono";
        perso1.apellido = "cilindrero";
        perso1.edad = 21;
        System.out.println(perso1);
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona();
        perso2.nombre = "Diego";
        perso2.apellido = "Sanchez";
        perso2.edad = 21;
        System.out.println(perso2);
        imprimirPersonas(perso2);
        
    }
    public static void imprimirPersonas(Persona perso) {
        System.out.println("Diereccion " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        
    }
}
//son plsntillsd
//son tipos de datos
class Persona{
    String nombre;
    String apellido;
    int edad;
    
}