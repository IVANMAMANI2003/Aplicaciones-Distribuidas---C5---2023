
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int tamaño1, tamaño2, tamaño3, suma;
        List< String> pasajeS1=new ArrayList<String> ();
        List< String> pasajeS2=new ArrayList<String> ();
        List< String> pasajeS3=new ArrayList<String> ();
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
        pasajeS3.add("Elias");pasajeS1.add("Juan");
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
        pasajeS3.add("Elias");pasajeS1.add("Juan");
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
        pasajeS3.add("Elias");pasajeS1.add("Juan");
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


        long tiempoInicio = System.nanoTime();

        pasajeS1.stream().forEach(s -> System.out.println(s));
        tamaño1=pasajeS3.size();

        pasajeS2.stream().forEach(s -> System.out.println(s));
        tamaño2=pasajeS3.size();

        pasajeS3.stream().forEach(s -> System.out.println(s));
        tamaño3=pasajeS3.size();

        System.out.println();
        suma = tamaño1 + tamaño2 + tamaño3;
        System.out.println(suma);
        long tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo sin programacion paralela =  " + ((tiempoFin-tiempoInicio)));

        System.out.println();
        System.out.println();

         tiempoInicio = System.nanoTime();

        pasajeS1.stream().parallel().forEach(s -> System.out.println(s));
        tamaño1=pasajeS3.size();

        pasajeS2.stream().parallel().forEach(s -> System.out.println(s));
        tamaño2=pasajeS3.size();

        pasajeS3.stream().parallel().forEach(s -> System.out.println(s));
        tamaño3=pasajeS3.size();

        System.out.println();
        suma = tamaño1 + tamaño2 + tamaño3;
        System.out.println(suma);
        tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));
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
        pasajeS1.stream().parallel().forEach(s -> System.out.println(s));
        tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)));*/
    }

}