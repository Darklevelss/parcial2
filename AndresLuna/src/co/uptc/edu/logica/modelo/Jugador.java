package co.uptc.edu.logica.modelo;

import java.util.ArrayList;

public class Jugador extends Empleado{

    private float Estatura,Peso;

    public Jugador() {
        setSalario(1000000);
    }

    public double getPremios() {
        return Premios;
    }

    public String getTallaUniforme() {
        return TallaUniforme;
    }

    public void setTallaUniforme(String tallaUniforme) {
        TallaUniforme = tallaUniforme;
    }

    private String TallaUniforme;
    private double Premios;

    public void setPremios(double premios) {
        Premios = premios;
    }

    public float getEstatura() {
        return Estatura;
    }

    public void setEstatura(float estatura) {
        Estatura = estatura;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    @Override
    public double Pago() {
        return getSalario()+getPremios() ;
    }
}
