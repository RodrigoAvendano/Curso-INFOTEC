import java.util.regex.*;
class Hora{
    int number;
    Hora(int number){
        this.number = number;
        setHora(this.number);
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setHora(Integer number){
        if(number>=6 && number <=12) {
            System.out.println("Buenos días");
        } else if(number >12 && number <=20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas Noches");
        }
    }
    
    public Boolean Comprobacion(String number){

        String regex = "la (\\w+) dice hola a la (\\w+)";
        Pattern pat = Pattern.compile(regex);
        return true;
    }
}