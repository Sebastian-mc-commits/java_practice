package com.sena.objects;


public class Vehiculo {
    public String modelo, color, propietario, placa, etiqueta, speed;
    public static int cars = 0;

    public Vehiculo(String placa) {
        this.placa = placa;
        Vehiculo.cars++;
    }
    public Vehiculo(String placa, String etiqueta, String propietario, String modelo, String color, int speed) {
        this.placa = placa;
        this.etiqueta = etiqueta;
        this.propietario = propietario;
        this.modelo = modelo;
        this.color = color;
        Vehiculo.cars++;
    }


    //set: asignar valor,
    // get: Obtener valor

    public String getPlaca() {
        return this.placa;
    }

    public String getEtiqueta() {
        return this.etiqueta;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}