package co.uptc.edu.logica.modelo;

import java.util.ArrayList;

public class Medico extends Empleado {

    private String tipoMed;
    private ArrayList<Dia> Horario;


    public String getTipoMed() {
        return tipoMed;
    }


    public Medico() {
        Horario = new ArrayList<Dia>();

    }

    @Override
    public double Pago() {
        int t=0;
        for (Dia i:getHorario()) {
            t+=i.getHorasTrabajadas();
        }
        return getSalarioBase()*t;
    }

    @Override
    public String toString() {
        return getNombre()+" "+getApellido()+"edad"+getEdad()+" "+getNumDocumento()+" "+getTipoDocumento()+" "+getTipoMed()+" "+Pago();
    }

    private void setPrecioHora() {
        if (tipoMed.equalsIgnoreCase("General")) {
            setSalarioBase(40000);
        } else if (tipoMed.equalsIgnoreCase("Deportivo")) {
           setSalarioBase(50000);
        } else {
            setSalarioBase(70000);
        }
    }

    public void setTipoMed(String tipoMed) {
        this.tipoMed = tipoMed;
    }

    public void setHorario(ArrayList<Dia> horario) {
        Horario = horario;
    }

    public ArrayList<Dia> getHorario() {
        return Horario;
    }

}
