import java.util.ArrayList;
import java.util.List;

public class EjemploLista2 {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(4523);
        listInteger.add(323);
        listInteger.add(60);

        listInteger.add(2,700);
        for(int indice = 0; indice < listInteger.size(); indice++){
            if(listInteger.get(indice)==60){
                listInteger.add(indice, 700);
            }
        }
        int indice2 = listInteger.indexOf(60);
        listInteger.add(indice2,700);
        listInteger.clear();
        
        for(int indice3 = 0; indice3 <listInteger.size(); indice3++){
            System.out.println(listInteger.get(indice3));
        }
    }
}
