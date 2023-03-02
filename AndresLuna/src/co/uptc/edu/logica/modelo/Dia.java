package co.uptc.edu.logica.modelo;



public class Dia {
private int HoraLlegada,HoraSalida;

    public Dia() {

    }

    public int getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        HoraLlegada = horaLlegada;
    }

    public int getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(int horaSalida) {
        HoraSalida = horaSalida;
    }
    public int getHorasTrabajadas(){
        return getHoraSalida()-getHoraLlegada();
    }
}
