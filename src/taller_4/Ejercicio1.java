/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_4;

/**
 *
 * @author ASUS
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante e = new Estudiante();

        e.setNombre("Laura");
        e.setEdad(20);
        e.setNotaPromedio(4.5);

        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Nota: " + e.getNotaPromedio()); 
    }
    
}
