import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class Diccionario {

    @SerializedName("diccionario")
    private ArrayList<Indice> diccionario;

    public Diccionario() {
        this.diccionario = new ArrayList();
    }

    public ArrayList<Indice> getdiccionario() {
        return diccionario;
    }

    public void setdiccionario(ArrayList<Indice> diccionario) {
        this.diccionario = diccionario;
    }
    @Override
    public String toString() {
        return "Diccionario{" + diccionario +'}';
    }
}
