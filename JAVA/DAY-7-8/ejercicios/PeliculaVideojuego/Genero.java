public enum Genero {
    TERROR("Terror"), ACCION("Acción"), FANTASIA("Fantasia"), FICCION("Ciencia Ficción");

    private String gender;

    private Genero(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
