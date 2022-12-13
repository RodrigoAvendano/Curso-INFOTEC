import java.util.ArrayList;

public class Person {

    
    private ArrayList<Archivojson> persona;

    public Person() {
        
        this.persona = new ArrayList();
    }

    public ArrayList<Archivojson> getAsignaturas() {
        return persona;
    }

    public void setAsignaturas(ArrayList<Archivojson> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "{" + " persona=" + persona + '}';
    }
}