    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ensayo4p2;
import java.util.Scanner;
/**
 *
 * @author Gianella Paulina Lopez Mora
 */
public class ejerciciocuatro {

    /**
     * @param args the command line arguments
     */
    public static void mostrarDatos(String nombre, int edad){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:  " + edad);
        
        if(edad>=18){
            System.out.println("Es mayor edad edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        nombre = "Gianella";
        edad = 17;
        
        mostrarDatos(nombre, edad);
    }
    
}
