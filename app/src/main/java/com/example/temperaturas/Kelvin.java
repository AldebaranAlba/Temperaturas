package com.example.temperaturas;

public class Kelvin extends Grado{

    public Kelvin(double grado){
        this.numero_grados = grado;
    }

    @Override
    public double parse(Kelvin kel) {
        return  this.getGrado();
    }

    @Override
    public double parse(Celcius cel) {
        double grados_cel =  cel.getGrado();
        double resultado = grados_cel + 273.15;
        return resultado;
    }

    @Override
    public double parse(Farenheit far) {
        double grados_far = far.getGrado();
        double resultado = (grados_far -32) * 5/9 + 273.15;
        return resultado;
    }
}
