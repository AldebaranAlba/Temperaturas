package com.example.temperaturas;

public class Farenheit extends Grado {

    public Farenheit(double grado){
        this.numero_grados = grado;
    }

    @Override
    public double parse(Kelvin kel) {
        double grados_kav =  kel.getGrado();
        double resultado = (grados_kav - 273.15) * (9/5) + 32;
        return resultado;
    }

    @Override
    public double parse(Celcius cel) {
        double grados_cel =  cel.getGrado();
        double resultado = (grados_cel * 9/5) +32;
        return resultado;
    }

    @Override
    public double parse(Farenheit far) {
        return this.getGrado();
    }
}
