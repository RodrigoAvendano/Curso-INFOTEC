package com.enumeradores.peliculavideojuego;

public class Videojuego implements Activar {
    private String titulo;
    private Integer duracion = 600;
    private Boolean estatus = false;
    private Gender gender;
    private Compania compania;
    
    Videojuego(String titulo, Integer duracion, Boolean estatus, Gender gender, Compania compania) {
        this.titulo = titulo;
        this.duracion = duracion;
        this. estatus = estatus;
        this.gender = gender;
        this.compania = compania;
    }

    Videojuego(String titulo, Integer duracion, Gender gender, Compania compania) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.gender = gender;
        this.compania = compania;
    }
   
    Videojuego(String titulo, Integer duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.gender = Gender.ACCION;
        this.compania = Compania.CAPCOM;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getGender() {
        return this.gender.getGender();
    }

    public String getCompania() {
        return this.compania.getCompany();
    }    

    public String toString() {
        String estado;
        if(estatus) {
            estado = "Ya disponible";
        } else {
            estado = "Próximamente";
        }
        return titulo+" de compañia: "+getCompania()+"\nGénero: "+getGender()+"\nDuración: "+duracion+" minutos\n"+estado;
    }

    public void activar() {
        this.estatus = true;
    }
    public void desactivar() {
        this.estatus = false;
    }

    public Boolean isActivo() {
        return estatus;
    }

    public void compareTo(Object a) {
        if(a != null && a instanceof Pelicula) {
            Pelicula temp = (Pelicula)a;
            Integer d1 = temp.getDuracion();
            Integer d2 = this.duracion;
            if(d1 == d2) {
                System.out.println("Ambos tienen la misma duración");
            } else {
                if(d1 > d2) {
                    System.out.println("La duración de "+temp.getTitulo()+" es mayor");
                } else {
                    System.out.println("La duración de "+this.titulo+" es mayor");
                }
            }
        } else {
            System.out.println("No se conoce el Objeto ingresado");
        }
    }
}
