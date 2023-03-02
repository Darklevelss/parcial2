package co.uptc.edu.logica.modelo;

import java.util.ArrayList;

public class Jugador extends Empleado {

    private float Estatura, Peso;

    public String getTallaPantalon() {
        return TallaPantalon;
    }

    public void setTallaPantalon(String tallaPantalon) {
        TallaPantalon = tallaPantalon;
    }

    public String getTallaCamiseta() {
        return TallaCamiseta;
    }

    public void setTallaCamiseta(String tallaCamiseta) {
        TallaCamiseta = tallaCamiseta;
    }

    private String TallaPantalon, TallaCamiseta;
    private double Premios;

    public Jugador() {
        setSalarioBase(1000000);
    }

    @Override
    public double Pago() {
        return getSalarioBase()-costoPieza(getTallaPantalon())- costoPieza(getTallaCamiseta());
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


    public double getPremios() {
        return Premios;
    }
private double costoPieza(String talla){
        if (talla.equalsIgnoreCase("S")||talla.equalsIgnoreCase("M")){
            return 20000;
        }else {
            return 25000;
        }

}
    public void setPremios(double premios) {
        Premios = premios;
    }
}
