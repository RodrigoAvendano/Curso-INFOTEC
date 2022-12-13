public class Videojuego implements Activar {
    String titulo;
    Integer duracion = 600;
    Boolean estatus = false;
    String genero;
    String compania;
    
    Videojuego(String titulo, Integer duracion, Boolean estatus, String genero, String compania) {
        this.titulo = titulo;
        this.duracion = duracion;
        this. estatus = estatus;
        this.genero = genero;
        this.compania = compania;
    }

    Videojuego(String titulo, Integer duracion, String genero, String compania) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.compania = compania;
    }
   
    Videojuego(String titulo, Integer duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = "Desconocido";
        this.compania = "Desconocida";
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }    

    public String toString() {
        String estado;
        if(estatus) {
            estado = "Ya disponible";
        } else {
            estado = "Próximamente";
        }
        return titulo+" de compañia: "+compania+"\nGénero: "+genero+"\nDuración: "+duracion+" minutos\n"+estado;
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
