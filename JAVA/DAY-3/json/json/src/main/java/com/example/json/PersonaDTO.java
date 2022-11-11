package com.example.json;

public class PersonaDTO {

    private String nombre;
    private String apellido;
    private String[] array;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setArray(String[] array){
        this.array = array;
    }

    public String[] getArray() {
        return this.array;
    }
}
