package com.enumeradores.peliculavideojuego;

public class Pelicula implements Activar {
    private String titulo;
    private Integer duracion = 120;
    private Boolean estatus = false;
    private Genero genero = Genero.ACCION;
    private String director;

    Pelicula(String titulo, Integer duracion, Boolean estatus, Genero genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.estatus = estatus;
        this.genero = genero;
        this. director = director;
    }

    Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this. director = director;
    }

    Pelicula(String titulo, Integer duracion, Genero genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this. director = director;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return this.genero.getGenero();
    }

    public String toString() {
        String estado;
        if(estatus) {
            estado = "Ya en cines";
        } else {
            estado = "Próximamente";
        }
        return titulo+" del director: "+director+"\nGénero: "+this.genero.getGenero()+"\nDuración: "+duracion+" minutos\n"+estado;
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
        if(a != null && a instanceof Videojuego) {
            Videojuego temp = (Videojuego)a;
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
