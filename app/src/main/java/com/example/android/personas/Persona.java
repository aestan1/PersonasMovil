package com.example.android.personas;

/**
 * Created by android on 19/09/2017.
 */

public class Persona {
    private String cedulaa;
    private String nombre;
    private String apellido;

    public Persona(String cedulaa, String nombre, String apellido) {
        this.cedulaa = cedulaa;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedulaa() {
        return cedulaa;
    }

    public void setCedulaa(String cedulaa) {
        this.cedulaa = cedulaa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
