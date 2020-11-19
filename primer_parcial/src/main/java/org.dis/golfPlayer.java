package org.dis;//Clase para crear el objeto plano (POJO) con anotaciones

import com.opencsv.*;

public class golfPlayer {
    @CSVBindByName
    private String posicion;
    @CSVBindByName
    private String nombre;
    @CSVBindByName
    private String apellido;
    @CSVBindByName
    private String pais;
    @CSVBindByName
    private int edad;


    public golfPlayer(String posicion, String nombre,  String apellido,String pais,int edad) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setDorsal(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad= edad;
    }

    @Override
    public String toString() {
        return "Posicion=" + posicion + ", Nombre=" + nombre + ", Apellido="
                + apellido + ", Pais=" + pais+ ",Edad:"+edad;
    }
}