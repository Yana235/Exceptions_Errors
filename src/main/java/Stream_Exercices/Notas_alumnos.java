package Stream_Exercices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notas_alumnos implements Serializable {

    //El archivo alumnos_nota.txt contiene una lista de 10 alumnso(mapa) y las notas
    // que han obtenido en cada asignatura. El número de asignaturas es variable.
    //Hay que mostrar por pantalla la nota media de cada alumno,el apellido y el nombre(en un String)
    //ordenado de mayor a menor

    public static void main(String[] args) throws IOException {
        //    List<String> students = readFile();
     //   Map<String, Double> lista = new HashMap<>();

        try (BufferedReader o = new BufferedReader(new FileReader("alumnos_notas.txt"))) {


            String[] alumno;
            String[] nota;

            String linea;

            while ((linea = o.readLine()) != null) {
                alumno = linea.split(" ");
                //nota = linea.split(" ");

                int notas;


            //    int line = Integer.parseInt(notaMedia[4]);
                for(int i=0;i<alumno.length;i++){
                    System.out.println(alumno[i]);
                 //   if(notas[2]>0 && notas[2]<2){

                //        System.out.println(notas);
                    }
                    for(int j=2;j<alumno.length;j++){
                        double notaMedia=Double.parseDouble(alumno[j]);
                        System.out.println(notaMedia);
                }

                }
            //    System.out.println(alumno[2]+notaMedia[2]);
            }    //catch(){ }


        }

    }

