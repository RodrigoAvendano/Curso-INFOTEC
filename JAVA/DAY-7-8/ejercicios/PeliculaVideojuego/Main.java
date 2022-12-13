public class Main {

    public static void main(String[] args) {
        Pelicula arrayPelicula[]=new Pelicula[5];
        
        arrayPelicula[0] = new Pelicula("Avengers",140,true, Genero.ACCION,"Hermanos Russo");
        arrayPelicula[1] = new Pelicula("Jurassic Park","Steven Spielberg");
        arrayPelicula[2] = new Pelicula("IT", 135, Genero.TERROR, "Andrés Muschietti");
        arrayPelicula[3] = new Pelicula("Un lugar en silencio", 90, true, Genero.TERROR, "John Krasinski");
        arrayPelicula[4] = new Pelicula("Extraordinario","Stephen Chbosky");
        arrayPelicula[1].activar();
        arrayPelicula[2].activar();
        
        Videojuego arrayVideojuego[]=new Videojuego[5];  
        arrayVideojuego[0] = new Videojuego("Persona 5", 100, true, "Rol", "Atlus")   ;
        arrayVideojuego[1] = new Videojuego("Pokemon Sword",60);
        arrayVideojuego[2] = new Videojuego("Monster Hunter Rise", 120, "Rol", "Capcom");
        arrayVideojuego[3] = new Videojuego("Fire Emblem: Three Houses", 100, true, "Estrategia", "Intelligent Systems");
        arrayVideojuego[4] = new Videojuego("Stray",10);
        arrayVideojuego[4].activar();
        arrayVideojuego[2].activar();

        Integer activados = 0;
        Integer duracion = 0;
        Integer aux = 0;
        Integer contador = 0;
        Integer indice = -1;
        Integer indice2 = -1;

        for(int x=0; x<arrayPelicula.length; x++) { 
            if(arrayPelicula[x].getGender() == "Terror" && contador == 0) {
                duracion = arrayPelicula[x].getDuracion();
                contador++;
            }
            aux = arrayPelicula[x].getDuracion();
            if(aux < duracion && arrayPelicula[x].getGender() == "Terror") {
                duracion = arrayPelicula[x].getDuracion();
                indice2 = x;
            }

            if(arrayPelicula[x].isActivo() == true) {
                activados++;
            } else {
                System.out.println(arrayPelicula[x].getTitulo()+" esta desactivada");

            }
        }
        System.out.println("El número de películas activadas son "+activados);

        activados = 0;
        aux = 0;
        duracion = 0;

        for(int x=0; x<arrayVideojuego.length; x++) {
            if(x == 0) {
                duracion = arrayVideojuego[x].getDuracion();
            }
            aux = arrayVideojuego[x].getDuracion();
            if(aux < duracion) {
                duracion = arrayVideojuego[x].getDuracion();
                indice = x;
            }

            if(arrayVideojuego[x].isActivo() == true) {
                activados++;
            } else {
                System.out.println(arrayVideojuego[x].getTitulo()+" esta desactivado");
            }
        }
        System.out.println("El número de videojuegos activados son "+activados);

        System.out.println("Videoujuego con más duración:");
        System.out.println(arrayVideojuego[indice].toString());

        if(indice2 > -1) {
            System.out.println("\nPelícula de terror con más duración:");
            System.out.println(arrayPelicula[indice2].toString());
        }
        

        

    }
    
}
