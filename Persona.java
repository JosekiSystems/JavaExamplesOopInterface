package com.josekisystems.poointerfaces.imprenta.modelo;

public class Persona  implements Imprimible{

    private String nombre;
    private String appellido;

    public Persona() {
    }

    public Persona(String nombre, String appellido) {
        this.nombre = nombre;
        this.appellido = appellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    @Override
    public String toString() {
        return  nombre + " " + appellido;
    }

}
