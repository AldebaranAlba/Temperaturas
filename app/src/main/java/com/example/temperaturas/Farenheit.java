package com.example.temperaturas;

public class Farenheit extends Grado {


    public Farenheit(double grado){
        this.setValor(grado);
        this.setUnidad("F");
    }

    public Farenheit parse(Kelvin kel) {
        double valor = (kel.getValor() - 273.15) * 9/5 +32;
        Farenheit farenheit = new Farenheit(valor);
        return farenheit;
    }


    public Farenheit parse(Celcius cel) {
        double valor = (cel.getValor() - 273.15) * 9/5 + 32;
        Farenheit farenheit = new Farenheit(valor);
        return farenheit;
    }

}
