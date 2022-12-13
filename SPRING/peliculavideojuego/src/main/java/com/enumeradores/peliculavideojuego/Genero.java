package com.enumeradores.peliculavideojuego;

public enum Genero {
    TERROR("Terror"), ACCION("Acción"), FANTASIA("Fantasia"), FICCION("Ciencia Ficción");

    private String genero;

    private Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }
}
