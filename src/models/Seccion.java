/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lunar
 */
public class Seccion {
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;
    private int municipio;
    private int distrito;
    private int listado;
    private int votantes;

    public Seccion() {
    }

    public Seccion(int id, String nombre, double latitud, double longitud, int municipio, int distrito, int listado, int votantes) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.municipio = municipio;
        this.distrito = distrito;
        this.listado = listado;
        this.votantes = votantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public int getListado() {
        return listado;
    }

    public void setListado(int listado) {
        this.listado = listado;
    }

    public int getVotantes() {
        return votantes;
    }

    public void setVotantes(int votantes) {
        this.votantes = votantes;
    }

    @Override
    public String toString() {
        return "Seccion{" + "id=" + id + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", municipio=" + municipio + ", distrito=" + distrito + ", listado=" + listado + ", votantes=" + votantes + '}';
    }
    
    
}
