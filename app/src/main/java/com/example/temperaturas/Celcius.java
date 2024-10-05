package com.example.temperaturas;

public class Celcius extends Grado {



    public Celcius(double grado){
        this.setValor(grado);
        this.setUnidad("C");
    }


    public Celcius parse(Kelvin kel) {
        double valor = kel.getValor() - 273.15;
        Celcius celcius = new Celcius(valor);
        return celcius;
    }


    public Celcius parse(Farenheit far) {
        double valor = (far.getValor() - 32) * 5/9;
        Celcius celcius = new Celcius(valor);
        return celcius;
    }
}
