package co.uptc.edu.logica.modelo;

import java.util.ArrayList;

public class Medico extends Empleado{
    private float PrecioHora;
    private String tipoMed; private ArrayList<Dia> Horario;

    public float getPrecioHora() {
        return PrecioHora;
    }

    public String getTipoMed() {
        return tipoMed;
    }



    public Medico() {
        Horario = new ArrayList<>();
        PrecioHora=setPrecioHora();
    }

    private float setPrecioHora(){
        if (tipoMed.equalsIgnoreCase("General")){
            return 40000;
        } else if (tipoMed.equalsIgnoreCase("Deportivo")) {
            return 50000;
        }else {
        return 70000;}
    }

    public void setTipoMed(String tipoMed) {
        this.tipoMed = tipoMed;
    }

    public void setPrecioHora(float precioHora) {
        PrecioHora = precioHora;
    }

    public ArrayList<Dia> getHorario() {
        return Horario;
    }

    public void setHorario(ArrayList<Dia> horario) {
        Horario = horario;
    }

    private int horasSemanales(){
        int j=0;
        for (int i=0;i<getHorario().size();i++){
            j+=getHorario().get(i).getHoraSalida()-getHorario().get(i).getHoraLlegada();}
        return j;
    }
    @Override
    public double Pago() {
        return PrecioHora*horasSemanales();
    }
}
