/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_4;

/**
 *
 * @author ASUS
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*MetaWz p = new MetaWz();
        p.nombre = "Razor";*/ //ERROR el atricuto solo se puede usar dentro de la calse persona - al ser main otra clase deniega el acceso.
        
        MetaWz p = new MetaWz();
        p.setNombre("Razor 9 mm ");

        System.out.println(p.getNombre());
        
        
    }
    
}
