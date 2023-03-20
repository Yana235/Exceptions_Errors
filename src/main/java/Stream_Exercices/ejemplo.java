package Stream_Exercices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Notas de alumnos: El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas que han obtenido
 * en cada asignatura. El número de asignaturas de cada alumno es variable.
 * Implementa un programa que muestre por pantalla la nota media de cada alumno junto a su nombre y apellido,
 * ordenado por nota media de mayor a menor.
 */

public class ejemplo {

    public static final String FILE_NAME = "Documentos/alumnos_notas.txt";

    public static void main(String[] args) {
        List<String> students = readFile();
        Map<String,Double> studentsAvegage = new TreeMap<>();
        String name;
        int i = 0;
        double average;
        for (String student : students) {
            try{
                average = 0;
                String[] splitted = student.split(" ");
                if(splitted.length<2)
                    throw new Exception("Longitud estudiante incorrecta");
                name = splitted[0]+" " +splitted[1];
                for (i = 2; i < splitted.length; i++) {
                    average += Double.parseDouble(splitted[i]);
                }
                average /= (i-2);
                studentsAvegage.put(name,average);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("ANTES DE ORDENARLO");
        studentsAvegage.forEach((k,v)-> System.out.println(k + "=" + v));

        System.out.println("DESPUÉS DE ORDENARLO");
        List<Map.Entry<String, Double>> list = new ArrayList<>(studentsAvegage.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        list.forEach(System.out::println);

    }

    public static List<String> readFile(){
        List<String> lines = new ArrayList<>();
        String line;
        try( BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            do{
                line = br.readLine();
                if (line!=null)
                    lines.add(line);
            }while(line != null);
        } catch (IOException e) {
        }
        return lines;
    }

}