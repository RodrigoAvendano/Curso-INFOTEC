package com.animal.animal;

public class Animal {

    private Integer idAnimal;
    private Tipo animal;

    public Animal(Integer idAnimal, Tipo animal) {
        this.idAnimal = idAnimal;
        this.animal = animal;
    }

    public String getAnimal() {
        return this.animal.getTipo();
    }

    public Integer getId() {
        return this.idAnimal;
    }
    
}
