/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lunar
 */
public class Animal {
    private String tipo;
    private String raza;
    private String color;
    private int edad;
    private double altura;
    private double peso;

    public Animal() {
    }

    public Animal(String tipo, String raza, String color, int edad, double altura, double peso) {
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
}
