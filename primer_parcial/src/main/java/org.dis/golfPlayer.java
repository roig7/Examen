package org.dis;//Clase para crear el objeto plano (POJO) con anotaciones

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class golfPlayer {

    @CsvBindByName(column = "Posicion")
    private String posicion;
    @CsvBindByName(column = "Nombre")
    private String nombre;
    @CsvBindByName(column = "Apellido")
    private String apellido;
    @CsvBindByName(column = "Pais")
    private String pais;
    @CsvBindByName(column = "Edad")
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