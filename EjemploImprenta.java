package com.josekisystems.poointerfaces.imprenta;

import com.josekisystems.poointerfaces.imprenta.modelo.*;

import static com.josekisystems.poointerfaces.imprenta.modelo.Genero.COMEDIA;
import static com.josekisystems.poointerfaces.imprenta.modelo.Imprimible.TEXTO_DEFECTO;
import static com.josekisystems.poointerfaces.imprenta.modelo.Imprimible.imprimir;



public class EjemploImprenta {
    public static void main(String[] args) {


        Curriculo cv = new Curriculo(new Persona("Rodrigo", "Avendaño"),"Block Chain Developer","Resumen Laboral");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador Fullstack")
        .addExperiencia("Angular");


        Libro libro = new Libro(new Persona("William","Shakespeare"),"El Mercader de Venecia", COMEDIA);

        libro.addPagina(new Pagina("Primer Acto"))
                .addPagina(new Pagina("Segundo Acto"))
                .addPagina(new Pagina("Tercer Acto"));


        Informe informe = new Informe(new Persona("Joaquin Rodrigo", "Avendaño de la Selva"),new Persona("Jesus", "De Nazaret"),"Estudio sobre Block-Chain y los estados de la imformacion digital" );

        Persona persona1 = new Persona();

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
        imprimir(persona1);

        //Implementacion de la interface al vuelvo
        Imprimible objImp = (new Imprimible() {
            @Override
            public String imprimir() {
                return "Imprimiendo una clase al vuelo";
            }
        });
        imprimir(objImp);

        System.out.println("\n"+"TEXTO_DEFECTO de la interface = " + TEXTO_DEFECTO);
    }

    //public static void imprimir (Hoja imprimible) Se quitó hoja para implemetar la interface Imprimible


}
