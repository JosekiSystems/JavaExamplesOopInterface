package com.josekisystems.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;



    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();

    }

    public Curriculo addExperiencia (String exp){
        experiencias.add(exp);
        return this;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("--- CV ---"+"\n"+"Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: " ).append(this.contenido)
                .append("\n")
                .append("Profession: ")
                .append(this.carrera)
                .append("\n")
                .append("Experiencias: \n");

        for(String exp: this.experiencias){
            sb.append("_ ")
                    .append(exp)
                    .append("\n");
        }
        return sb.toString();
    }
}
