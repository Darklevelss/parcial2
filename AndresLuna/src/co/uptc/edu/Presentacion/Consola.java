package co.uptc.edu.Presentacion;

import co.uptc.edu.logica.Control.Club;

public class Consola {
    Club club=new Club();
    public void menu() {
        System.out.println("""
                <<<<<<<<menu>>>>>>>
                1.crear
                2.mostrar todos
                3.mostrar por nombre
                """);

    }
}
