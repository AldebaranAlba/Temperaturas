package com.example.temperaturas;

public class Celcius extends Grado {


    public Celcius(double grado){
        this.numero_grados = grado;
    }

    @Override
    public double parse(Kelvin kel) {
        double grados_kel = kel.getGrado();
        double resultado = grados_kel - 273.15;
        return resultado;
    }

    @Override
    public double parse(Celcius cel) {
        return this.getGrado();
    }

    @Override
    public double parse(Farenheit far) {
        double grados_far = far.getGrado();
        double resultado = (grados_far - 32) * 5/9;
        return resultado;
    }
}
