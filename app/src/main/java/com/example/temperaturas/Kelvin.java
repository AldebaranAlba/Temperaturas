package com.example.temperaturas;

public class Kelvin extends Grado{

    public Kelvin(double grado){
        this.setValor(grado);
        this.setUnidad("K");
    }

    public Kelvin parse(Celcius cel) {
        double valor = cel.getValor() + 273.15;
        Kelvin kelvin = new Kelvin(valor);
        return kelvin;
    }


    public Kelvin parse(Farenheit far) {
        double valor = (far.getValor() - 32) * 5/9 + 273.15;
        Kelvin kelvin = new Kelvin(valor);
        return kelvin;
    }
}
