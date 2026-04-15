/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_4;

/**
 *
 * @author ASUS
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    
    
    public Coche(String marca, String modelo, int velocidadMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMaxima = velocidadMaxima;
}
    
     public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("Incremento inválido");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
}
