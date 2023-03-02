package co.uptc.edu.logica.modelo;

import java.util.ArrayList;

public class Administrativo extends Empleado {
    private int ExperienciaL;
    private ArrayList<Dia> Horario;
   ;

    public Administrativo() {
        Horario=new ArrayList<Dia>();
        setSalarioBase(100000);
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

    public void setHorario(ArrayList<Dia> horario) {
        Horario = horario;
    }

    @Override
    public double Pago() {
        return (horasSemanales()*4*getSalarioBase()+(getExperienciaL()*(getSalarioBase()*4*horasSemanales()*0.2)));
    }
    public String toString(){
        return getNombre()+" "+getApellido()+"edad"+getEdad()+" "+getNumDocumento()+" "+getTipoDocumento()+" "+
                Pago()+" "+getExperienciaL();
    }
}
