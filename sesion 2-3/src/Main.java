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
        /*String rutaUrl = "https://upeu.edu.pe/";
        URL url= new URL(rutaUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        String resultado = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining());
        System.out.println(resultado);*/

        List<String> rutaUrls = new ArrayList<>();
        rutaUrls.add("https://upeu.edu.pe/");
        rutaUrls.add("https://upeu.edu.pe/fce/");
        rutaUrls.add("https://upeu.edu.pe/facihed/");
        rutaUrls.add("https://upeu.edu.pe/fia/");
        rutaUrls.add("https://upeu.edu.pe/fsalud/");
        rutaUrls.add("https://upeu.edu.pe/teologia/");
        rutaUrls.add("https://upeu.edu.pe/");
        rutaUrls.add("https://upeu.edu.pe/fce/");
        rutaUrls.add("https://upeu.edu.pe/facihed/");
        rutaUrls.add("https://upeu.edu.pe/fia/");
        rutaUrls.add("https://upeu.edu.pe/fsalud/");
        rutaUrls.add("https://upeu.edu.pe/teologia/");
        rutaUrls.add("https://upeu.edu.pe/");
        rutaUrls.add("https://upeu.edu.pe/fce/");
        rutaUrls.add("https://upeu.edu.pe/facihed/");
        rutaUrls.add("https://upeu.edu.pe/fia/");
        rutaUrls.add("https://upeu.edu.pe/fsalud/");
        rutaUrls.add("https://upeu.edu.pe/teologia/");

        long tiempoInicio = System.nanoTime();
        rutaUrls.stream().forEach(s -> obtenercontenidodepagina(s));
        long tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo sin programacion paralela = " + ((tiempoFin-tiempoInicio)/1000000000));


        tiempoInicio = System.nanoTime();
        rutaUrls.stream().parallel().forEach(s -> obtenercontenidodepagina(s));
        tiempoFin= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de Tiempo con programacion paralela =  " + ((tiempoFin-tiempoInicio)/1000000000));
    }
    private static  String obtenercontenidodepagina(String rutaUrl){
        try {
            URL url= new URL(rutaUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            Stream<String> lineas = new BufferedReader(new InputStreamReader(inputStream))
                    .lines();
                    //.collect(Collectors.joining());
            return lineas.collect(Collectors.joining());
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }return "";
    }
}