package co.uptc.edu.logica.modelo;

import java.util.ArrayList;

public class Administrativo extends Empleado {
    private int ExperienciaL;
    private ArrayList<Dia> Horario;
   ;

    public Administrativo() {
        Horario=new ArrayList<>();
        setSalario(100000);
    }

    public int getExperienciaL() {
        return ExperienciaL;
    }

    public void setExperienciaL(int experienciaL) {
        ExperienciaL = experienciaL;
    }

    public ArrayList<Dia> getHorario() {
        return Horario;
    }
 private int horasSemanales(){
        int j=0;
        for (int i=0;i<getHorario().size();i++){
        j+=getHorario().get(i).getHoraSalida()-getHorario().get(i).getHoraLlegada();}
        return j;
 }
    @Override
    public double Pago() {
        return (horasSemanales()*getSalario()+(getExperienciaL()*(getSalario()*horasSemanales()*0.2)));
    }
}
