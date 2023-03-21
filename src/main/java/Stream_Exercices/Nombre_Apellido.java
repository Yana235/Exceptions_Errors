package Stream_Exercices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Nombre_Apellido implements Serializable {
//Genera de forma aleatoria nombres de personas (combinando nombres y aopellidos)
//Se le pedirá al usuario cuantós nombres de personas desea generar y en que archivos
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many names do you want?");
        int cantidad;
        cantidad=sc.nextInt();
          int arrays[]=new int[cantidad];

        try(BufferedReader o= new BufferedReader(new FileReader("usa_nombres.txt"));
        BufferedReader u=new BufferedReader(new FileReader("usa_apellidos.txt"))){
            String nombre;
            //antes de eso tengo que meter dentro de un array los datos
            // de los archivos para poder recorrerlos
            //for para recorer el archivo y luego cojer un string aleatorio

        }catch(IOException e){

            System.out.println(e.getMessage());

        }
    }




}
