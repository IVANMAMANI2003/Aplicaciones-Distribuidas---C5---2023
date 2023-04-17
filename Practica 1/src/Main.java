
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        int tamaño1, tamaño2, tamaño3, suma;
        List< String> pasajeS1=new ArrayList<String> ();
        List< String> pasajeS2=new ArrayList<String> ();
        List< String> pasajeS3=new ArrayList<String> ();
        List< String> pasajeTotal=new ArrayList<String> ();
        pasajeS1.add("Juan");
        pasajeS1.add("Pedro");
        pasajeS2.add("Lucas");
        pasajeS1.add("Juan");
        pasajeS3.add("Manuel");
        pasajeS2.add("David");
        pasajeS1.add("Ester");
        pasajeS2.add("Marisel");
        pasajeS2.add("Daniel");
        pasajeS1.add("Javier");
        pasajeS3.add("Jose");
        pasajeS3.add("Ayde");
        pasajeS1.add("Juan Lucas");
        pasajeS1.add("Pablo");
        pasajeS2.add("Lidia");
        pasajeS1.add("Cesar");
        pasajeS3.add("Julio");
        pasajeS2.add("Yovana");
        pasajeS1.add("Mila");
        pasajeS2.add("Aristoteles");
        pasajeS2.add("Daniel Alexis");
        pasajeS1.add("Alex");
        pasajeS3.add("Armando");
        pasajeS3.add("Elias");
        pasajeS1.add("Juan");
        pasajeS1.add("Pedro");
        pasajeS2.add("Lucas");
        pasajeS1.add("Juan");
        pasajeS3.add("Manuel");
        pasajeS2.add("David");
        pasajeS1.add("Ester");
        pasajeS2.add("Marisel");
        pasajeS2.add("Daniel");
        pasajeS1.add("Javier");
        pasajeS3.add("Jose");
        pasajeS3.add("Ayde");
        pasajeS1.add("Juan Lucas");
        pasajeS1.add("Pablo");
        pasajeS2.add("Lidia");
        pasajeS1.add("Cesar");
        pasajeS3.add("Julio");
        pasajeS2.add("Yovana");
        pasajeS1.add("Mila");
        pasajeS2.add("Aristoteles");
        pasajeS2.add("Daniel Alexis");
        pasajeS1.add("Alex");
        pasajeS3.add("Armando");
        pasajeS3.add("Elias");
        pasajeS1.add("Juan");
        pasajeS1.add("Pedro");
        pasajeS2.add("Lucas");
        pasajeS1.add("Juan");
        pasajeS3.add("Manuel");
        pasajeS2.add("David");
        pasajeS1.add("Ester");
        pasajeS2.add("Marisel");
        pasajeS2.add("Daniel");
        pasajeS1.add("Javier");
        pasajeS3.add("Jose");
        pasajeS3.add("Ayde");
        pasajeS1.add("Juan Lucas");
        pasajeS1.add("Pablo");
        pasajeS2.add("Lidia");
        pasajeS1.add("Cesar");
        pasajeS3.add("Julio");
        pasajeS2.add("Yovana");
        pasajeS1.add("Mila");
        pasajeS2.add("Aristoteles");
        pasajeS2.add("Daniel Alexis");
        pasajeS1.add("Alex");
        pasajeS3.add("Armando");
        pasajeS3.add("Elias");
        pasajeS1.add("Juands");
        pasajeS1.add("Pedro");
        pasajeS2.add("Lucas");
        pasajeS1.add("Juan");
        pasajeS3.add("Manuel");
        pasajeS2.add("David");
        pasajeS1.add("Ester");
        pasajeS2.add("Marisel");
        pasajeS2.add("Daniel");
        pasajeS1.add("Javier");
        pasajeS3.add("Jose");
        pasajeS3.add("Ayde");
        pasajeS1.add("Juan Lucas");
        pasajeS1.add("Pablo");
        pasajeS2.add("Lidia");
        pasajeS1.add("Cesar");
        pasajeS3.add("Julio");
        pasajeS2.add("Yovana");
        pasajeS1.add("Mila");
        pasajeS2.add("Aristoteles");
        pasajeS2.add("Daniel Alexis");
        pasajeS1.add("Alex");
        pasajeS3.add("Armando");
        pasajeS3.add("Elias");
        pasajeS1.add("Juand");
        pasajeS1.add("Pedro");
        pasajeS2.add("Lucas");
        pasajeS1.add("Juan");
        pasajeS3.add("Manuel");
        pasajeS2.add("David");
        pasajeS1.add("Ester");
        pasajeS2.add("Marisel");
        pasajeS2.add("Daniel");
        pasajeS1.add("Javier");
        pasajeS3.add("Jose");
        pasajeS3.add("Ayde");
        pasajeS1.add("Juan Lucas");
        pasajeS1.add("Pablo");
        pasajeS2.add("Lidia");
        pasajeS1.add("Cesar");
        pasajeS3.add("Julio");
        pasajeS2.add("Yovana");
        pasajeS1.add("Mila");
        pasajeS2.add("Aristoteles");
        pasajeS2.add("Daniel Alexis");
        pasajeS1.add("Alex");
        pasajeS3.add("Armando");
        pasajeS3.add("Elias");
        pasajeS1.add("Juanito");
        pasajeS1.add("Pedrito");
        pasajeS2.add("Lupita");
        pasajeS1.add("Juacito");
        pasajeS3.add("Matias");
        pasajeS2.add("Pytter");
        pasajeS1.add("Estela");
        pasajeS2.add("Maria");
        pasajeS2.add("Danielito");
        pasajeS1.add("Javiercito");
        pasajeS3.add("Josecito");
        pasajeS3.add("Aydecita");
        pasajeS1.add("Juan Lucascha");
        pasajeS1.add("Pablito");
        pasajeS2.add("Lida");
        pasajeS1.add("Cesarcito");
        pasajeS3.add("Juliocha");
        pasajeS2.add("Yovanita");
        pasajeS1.add("Milagros");
        pasajeS2.add("Arturos");
        pasajeS2.add("Daniela");
        pasajeS1.add("Alexa");
        pasajeS3.add("Armandito");
        pasajeS3.add("Eliascha");
/*
        long tiempoInicio = System.nanoTime();
        /*pasajeS1.stream().forEach(s -> System.out.println(s));
        System.out.println();
        pasajeS2.stream().forEach(s -> System.out.println(s));
        System.out.println();
        pasajeS1.stream().forEach(s -> System.out.println(s));

        long tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo sin programacion paralela =  " + ((tiempoFin-tiempoInicio)));

        System.out.println();


        tiempoInicio = System.nanoTime();
        /*pasajeS1.stream().parallel().forEach(s -> System.out.println(s));
        tamaño1=pasajeS1.size();
        pasajeS2.stream().parallel().forEach(s -> System.out.println(s));
        tamaño2=pasajeS2.size();
        pasajeS1.stream().parallel().forEach(s -> System.out.println(s));

        tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));
*/
        /*
        for(int i=0;i<pasajeS1.size();i++)
        {
            System.out.println();
            tamaño1=pasajeS1.size();
            System.out.println();
            System.out.print(pasajeS1.get(i)+" ");
            System.out.println();
            System.out.println("total de pasajes"+tamaño1);
        }
        System.out.println();
        for(int i=0;i<pasajeS2.size();i++)
        {
            System.out.println();
            tamaño2=pasajeS2.size();
            System.out.println();
            System.out.print(pasajeS2.get(i)+" ");
            System.out.println();
            System.out.println("total de pasajes"+tamaño2);
        }
        System.out.println();
        for(int i=0;i<pasajeS3.size();i++)
        {
            System.out.println();
            tamaño3=pasajeS3.size();
            System.out.println();
            System.out.print(pasajeS3.get(i)+" ");
            System.out.println();
            System.out.println("total de pasajes"+ tamaño3);
        }*/
        /*
        System.out.println();
        long tiempoInicio = System.nanoTime();
        System.out.println("Paralelo");
        System.out.println();
        int tamaños= pasajeS1.size() + pasajeS2.size()+ pasajeS3.size();

        System.out.println("Es igual a: "+ tamaños);
        long tiempoFin= System.nanoTime();

        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));
        pasajeS1.stream().parallel().;
*/
        /*for (int i = 0; i < pasajeS1 + pasaje .size(); i++) {
            System.out.println(pasajeS1.get(i));
        }

        long tiempoInicio = System.nanoTime();
        System.out.println();
        System.out.println("Concurrente");
        System.out.println();
        for (String cities:pasajeS1){
            System.out.println(cities);

        }
        System.out.println();
        long tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));

        System.out.println();
        tiempoInicio = System.nanoTime();
        System.out.println("Paralelo");
        System.out.println();
        pasajes.stream().parallel().forEach(s -> System.out.println(s));
        tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));*/

        System.out.println();
        long tiempoInicio = System.nanoTime();
        System.out.println("Paralelo");
        System.out.println();
        pasajeTotal.stream().parallel().forEach(s -> System.out.println(s);  
        long tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));
    }
     public void  contarcli(String pasajeS1,
    String pasajeS2,
    String pasajeS3) {


            System.out.println(pasajeS1 + pasajeS2 + pasajeS3);


    }

}