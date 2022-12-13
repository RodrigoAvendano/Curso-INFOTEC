package com.enumeradores.peliculavideojuego;

public enum Gender {
    ACCION("Acción"), AVENTURA("Aventura"), ARCADE("Arcade"), DEPORTES("Deporte"), ESTRATEGIA("Estrategia"), SIMULACION("Simulación");

    private String gender;

    private Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}

