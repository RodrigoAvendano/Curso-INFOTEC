package com.enumeradores.peliculavideojuego;

public enum Compania {
    ATLUS("Atlus"), GAMEFREAK("Gamefreak"), INTELLIGENTSYS("Intelligent Systems"), CAPCOM("Capcom");  
    
    private String company;

    private Compania(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }
}
