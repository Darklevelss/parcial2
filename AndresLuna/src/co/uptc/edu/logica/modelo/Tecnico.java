package co.uptc.edu.logica.modelo;

public class Tecnico extends Empleado{
    private String TipoTecnico;
    private final double SALARIO=1000000;

    public Tecnico() {
    }

    public String getTipoTecnico() {
        return TipoTecnico;
    }

    public void setTipoTecnico(String tipoTecnico) {
        TipoTecnico = tipoTecnico;
    }





    @Override
    public double Pago() {
        return SALARIO*0.885;
    }
}
