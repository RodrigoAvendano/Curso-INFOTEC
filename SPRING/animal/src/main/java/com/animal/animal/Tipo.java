package com.animal.animal;

public enum Tipo {
    LEON("León"), GATO("Gato"), PERRO("Perro"), VENADO("Venado"), ELEFANTE("Elefante");
    String animal;

    private Tipo(String animal) {
        this.animal = animal;
    }

    public String getTipo() {
        return this.animal;
    }

    @Override
    public String toString() {
        return this.animal;
    }
}
