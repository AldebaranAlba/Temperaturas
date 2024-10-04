package com.example.temperaturas;

public abstract class Grado  {

    public double numero_grados;

    public Grado(){

    }

    public double getGrado(){
        return numero_grados;
    }

    public void setGrado(double nuevo_grado){
        this.numero_grados = nuevo_grado;
    }

    public abstract double parse(Kelvin kel);

    public abstract double parse(Celcius cel);

    public abstract double parse(Farenheit far);

}
