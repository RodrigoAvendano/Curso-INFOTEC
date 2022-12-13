package com.diccionario.diccionario;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;
public class Indice {

    @SerializedName("palabras")
    private ArrayList<Palabra> palabras;

    public Indice() {
        this.palabras = new ArrayList();
    }

    public ArrayList<Palabra> getpalabras() {
        return palabras;
    }

    public void setpalabras(ArrayList<Palabra> palabras) {
        this.palabras = palabras;
    }

    @Override
    public String toString() {
        return "Indice{" + palabras +'}';
    }
}
