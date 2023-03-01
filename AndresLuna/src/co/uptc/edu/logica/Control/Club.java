package co.uptc.edu.logica.Control;

import co.uptc.edu.logica.modelo.*;

import java.util.ArrayList;

public class Club {
    private  ArrayList<Administrativo>Administrativos;
    private ArrayList<Campo>Campos;
    private ArrayList<Portero>Porteros;
    private ArrayList<Medico> Medicos;
    private ArrayList<Tecnico> Tecnicos;

    public Club() {
        Administrativos=new ArrayList<>();
        Campos=new ArrayList<>();
        Porteros=new ArrayList<>();
        Medicos=new ArrayList<>();
        Tecnicos=new ArrayList<>();
    }


    public ArrayList<Administrativo> getAdministrativos() {
        return Administrativos;
    }

    public ArrayList<Campo> getCampos() {
        return Campos;
    }

    public ArrayList<Portero> getPorteros() {
        return Porteros;
    }

    public ArrayList<Medico> getMedicos() {
        return Medicos;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return Tecnicos;
    }
}
