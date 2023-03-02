package co.uptc.edu.Presentacion;

import co.uptc.edu.logica.Control.Club;
import co.uptc.edu.logica.modelo.*;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Consola {
    Scanner sc=new Scanner(System.in);
    Club club=new Club();
    public void menu() {
        int op=4;
        int ite=3;
        while (ite>=0){
        club.crearAdministrativo();
        club.crearCampo();
        club.crearMedico();
        club.crearTecnico();
        club.crearPortero();ite--;}
        while (op!=0){
        System.out.println("""
                <<<<<<<<menu>>>>>>>
                1.crear
                2.mostrar todos
                3.mostrar por nombre
                0.salir
                """);
        op= sc.nextInt();
        switch (op) {
            case 1:
                club.crearAdministrativo();
                club.crearCampo();
                club.crearMedico();
                club.crearTecnico();
                club.crearPortero();
                break;
            case 2:
                mostrar();
                break;
            case 3:

            case 0:
                System.out.println("bye");
                break;
            default:
                System.out.println("ño");
                break;
        }
        }

    }
    private void mostrar(){

        for (Administrativo i:
             club.getAdministrativos()) {
            System.out.println(i.toString());
        }
        for (Campo i:
             club.getCampos()) {
            System.out.println(i.toString());
        }
        for (Portero i:
             club.getPorteros()) {
            System.out.println(i.toString());
        }
        for (Tecnico i:
             club.getTecnicos()) {
            System.out.println(i.toString());

        }
        for (Medico i: club.getMedicos()
             ) {
            System.out.println(i.toString());
        }

    }


}
