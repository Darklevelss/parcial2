package co.uptc.edu.logica.Control;

import co.uptc.edu.logica.modelo.*;
import co.uptc.edu.persistencia.*;

import java.util.ArrayList;
import java.util.Random;

public class Club {
    private ArrayList<Administrativo> Administrativos;
    private ArrayList<Campo> Campos;
    private ArrayList<Portero> Porteros;
    private ArrayList<Medico> Medicos;
    private ArrayList<Tecnico> Tecnicos;
    private String[] nombr;
    private String[] apelllidos;
    private String[] tallas;
    private String[] tipoMedico;
    private String[] tipoTecnico;
    private String[] tipoDocumento;
    private String [] pos;

    public Club() {
        Administrativos = new ArrayList<Administrativo>();
        Campos = new ArrayList<Campo>();
        Porteros = new ArrayList<Portero>();
        Medicos = new ArrayList<Medico>();
        Tecnicos = new ArrayList<Tecnico>();

        nombr = generarNombres();
        apelllidos = generarApellidos();
        tallas = generarTallas();
        tipoMedico = generarTipoMedico();
        tipoTecnico = generarTipoTecnico();
        tipoDocumento=generarTipoDocumento();
        pos=generarPosiciones();

    }
    private String[] generarNombres(){
        Nombres[] n=Nombres.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }
    private String[] generarPosiciones(){
        Posiciones[] n=Posiciones.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }
    private String[] generarApellidos(){
        Apellidos[] n=Apellidos.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }
    private String[] generarTallas(){
        Tallas[] n=Tallas.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }
    private String[] generarTipoMedico(){
        Tipomedico[] n=Tipomedico.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }
    private String[] generarTipoTecnico(){
        TiposTecnico[] n=TiposTecnico.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }
    private String[] generarTipoDocumento(){
        TipoDocumento[] n=TipoDocumento.values();
        String []h=new String[n.length];
        for (int i=0;i<n.length;i++){
            h[i]=n[i].toString();
        }
        return h;
    }

    public Tecnico crearTecnico() {
        Tecnico t = new Tecnico();
       ;
        t.setNombre(nombr[new Random().nextInt(nombr.length)]);
        t.setApellido(apelllidos [new Random().nextInt(apelllidos.length)]);
        t.setEdad(new Random().nextInt());
        t.setTipoTecnico(tipoTecnico[new Random().nextInt(tipoTecnico.length)]);
        t.setTipoDocumento(tipoDocumento[new Random().nextInt(tipoDocumento.length)]);
        t.setNumDocumento(String.valueOf(new Random().nextInt()));
        Tecnicos.add(t);
        return t;
    }
    public Portero crearPortero(){
        Portero p=new Portero();

        p.setNombre(nombr[new Random().nextInt(nombr.length)]);
        p.setApellido(apelllidos [new Random().nextInt(apelllidos.length)]);
        p.setEdad(new Random().nextInt());
        p.setTipoDocumento(tipoDocumento[new Random().nextInt(tipoDocumento.length)]);
        p.setNumDocumento(String.valueOf(new Random().nextInt()));
        p.setTallaGuantes(tallas[new Random().nextInt(tallas.length)]);
        p.setTallaCamiseta(tallas[new Random().nextInt(tallas.length)]);
        p.setTallaPantalon(tallas[new Random().nextInt(tallas.length)]);
        p.setEstatura(new Random().nextFloat());
        p.setPeso(new Random().nextFloat());
        p.setPremios(new Random().nextFloat());
        Porteros.add(p);
        return p;
    }
 public Campo crearCampo(){
     Campo p=new Campo();
     p.setNombre(nombr[new Random().nextInt(nombr.length)]);
     p.setApellido(apelllidos [new Random().nextInt(apelllidos.length)]);
     p.setEdad(new Random().nextInt());
     p.setTipoDocumento(tipoDocumento[new Random().nextInt(tipoDocumento.length)]);
     p.setNumDocumento(String.valueOf(new Random().nextInt()));
     p.setPosicionCampo(pos[new Random().nextInt(pos.length)]);
     p.setTallaCamiseta(tallas[new Random().nextInt(tallas.length)]);
     p.setTallaPantalon(tallas[new Random().nextInt(tallas.length)]);
     p.setEstatura(new Random().nextFloat());
     p.setPeso(new Random().nextFloat());
     p.setPremios(new Random().nextFloat());
     Campos.add(p);
     return p;
 }
 public Administrativo crearAdministrativo(){
        Administrativo p=new Administrativo();
     p.setNombre(nombr[new Random().nextInt(nombr.length)]);
     p.setApellido(apelllidos [new Random().nextInt(apelllidos.length)]);
     p.setEdad(new Random().nextInt());
     p.setTipoDocumento(tipoDocumento[new Random().nextInt(tipoDocumento.length)]);
     p.setNumDocumento(String.valueOf(new Random().nextInt()));
     p.setExperienciaL(new Random().nextInt());
     p.setHorario(crearHorario());
   Administrativos.add(p);
        return p;
 }
 public Medico crearMedico(){
        Medico p = new Medico();
     p.setNombre(nombr[new Random().nextInt(nombr.length)]);
     p.setApellido(apelllidos [new Random().nextInt(apelllidos.length)]);
     p.setEdad(new Random().nextInt());
     p.setTipoDocumento(tipoDocumento[new Random().nextInt(tipoDocumento.length)]);
     p.setNumDocumento(String.valueOf(new Random().nextInt()));
     p.setHorario(crearHorario());
     p.setTipoMed(tipoMedico[new Random().nextInt(tipoMedico.length)]);
     Medicos.add(p);
     return p;
 }
private ArrayList<Dia> crearHorario(){

    ArrayList<Dia> h=new ArrayList<Dia>();
    int i=5;
    while (i>=0){
        Dia d= new Dia();
        d.setHoraLlegada(new Random().nextInt(12)+7);
        d.setHoraSalida(d.getHoraLlegada()+new Random().nextInt(12)+1);
        h.add(d);
    i--;}
    return h;
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
