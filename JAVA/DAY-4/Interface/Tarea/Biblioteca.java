public class Biblioteca {

    private String codigo;
    private String titulo;
    private String estado;
    private int year;
    private int num;

    //código, el título, estado, y el año de publicación
    public Biblioteca(String codigo, String titulo, String estado, int year) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.year = year;
    }

    public Biblioteca(String codigo, String titulo, String estado, int year, int num) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.year = year;
        this.num = num;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }

    public Integer getNum() {
        return this.num;
    }

    public String getDatos() {
        if(this.num == 0){
            return "Código: "+this.codigo+"\nTítulo: "+this.titulo+"\nEstado: "+this.estado+"\nAño: "+this.year;
        }else {
            return "Código: "+this.codigo+"\nTítulo: "+this.titulo+"\nEstado: "+this.estado+"\nAño: "+this.year+"\nNúmero: "+num;
        }
    }
}
