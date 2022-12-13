package com.diccionario.diccionario;

import com.google.gson.annotations.SerializedName;

public class Palabra {
    
    @SerializedName("espanol")
    String espanol;
    @SerializedName("english")
    String english;
    @SerializedName("frances")
    String frances;

    public Palabra(String word, String num) {
        if(num == "1") {
            this.espanol= word;
        } else if(num == "2") {
            this.english = word;
        } else {
            this.frances = word;
        }
        
    }

    public String getEspanol() {
        return espanol;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public String getenglish() {
        return english;
    }

    public void setenglish(String english) {
        this.english = english;
    }

    public String getfrances() {
        return frances;
    }

    public void setfrances(String frances) {
        this.frances = frances;
    }

    @Override
    public String toString() {
        return "Palabra{" +" Español=" + espanol +" Inglés=" + english +", Francés= "+frances +'}';
    }
    
}
