/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_4;

/**
 *
 * @author ASUS
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche c = new Coche("Toyota", "Corolla", 180);

        c.acelerar(20);   //  válido
        c.acelerar(-10);  //  inválido

        System.out.println("Velocidad: " + c.getVelocidadMaxima());
    }
    
}
