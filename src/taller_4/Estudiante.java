/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_4;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    private String  nombre;
    private int edad;
    private double notaPromedio;
    
    public String getNombre() {
    return nombre;
}

    public int getEdad() {
    return edad;
}

    public double getNotaPromedio() {
    return notaPromedio;
}
    
     // Setters con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Nota inválida (0 - 5)");
        }
    }
    
}
