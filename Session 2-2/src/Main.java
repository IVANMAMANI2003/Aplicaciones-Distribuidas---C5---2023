import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List< String> city=new ArrayList<String> ();
        city.add("Lima");
        city.add("Cusco");
        city.add("Sicuani");
        city.add("Juliaca");
        city.add("Macusani");
        city.add("Puno");
        city.add("Ilave");
        city.add("San Martin");
        for (int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));
        }
        System.out.println();
        for (String cities:city){
            System.out.println(cities);
        }
        System.out.println();
        city.stream().parallel().forEach(s -> System.out.println(s));
    }
}