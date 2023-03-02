package co.uptc.edu.logica.modelo;

public class Tecnico extends Empleado{
    private String TipoTecnico;


    public Tecnico() {
        setSalarioBase(10000000);
    }

    @Override
    public double Pago() {
        return getSalarioBase()*0.885+(getSalarioBase()*0.885*porcentaje());
    }

    @Override
    public String toString() {
        return getNombre()+" "+getApellido()+"edad"+getEdad()+" "+getNumDocumento()+" "+getTipoDocumento()+" "+getTipoTecnico()+" "+Pago();
    }

    public String getTipoTecnico() {
        return TipoTecnico;
    }

    public void setTipoTecnico(String tipoTecnico) {
        TipoTecnico = tipoTecnico;
    }

private double porcentaje(){
        if (TipoTecnico.equalsIgnoreCase("principal")){
            return 0.1;
        }else if  (TipoTecnico.equalsIgnoreCase("preparador")){
            return 0.07;

        }else{
        return 0.02;}
}

}
