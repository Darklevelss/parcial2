package co.uptc.edu.logica.modelo;

public class Portero extends Jugador{
    private String TallaGuantes;

    public Portero() {
        setSalarioBase(getSalarioBase()-costoPieza(getTallaGuantes()));
    }

    public String getTallaGuantes() {
        return TallaGuantes;
    }

    public void setTallaGuantes(String tallaGuantes) {
        TallaGuantes = tallaGuantes;
    }
    private double costoPieza(String talla){
        if (talla.equalsIgnoreCase("S")||talla.equalsIgnoreCase("M")){
            return 20000;
        }else {
            return 25000;
        }
    }
}
