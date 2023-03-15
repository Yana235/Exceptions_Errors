package Practicas;

import java.io.*;

public class Exercise1 implements Serializable {
    //Se ha creado un texto(yana_salida.txt)y copiado
    // el contenido del texto(yana.txt)
    public static void main(String[] args) throws IOException, InvalidDocument {
        try (FileInputStream o = new FileInputStream("src/main/java/Practicas/yana.txt");
             FileOutputStream u = new FileOutputStream("yana_salida.txt")) {

            int c;

            c = o.read();
            while (c != -1) {
                u.write(c);
                c = o.read();
            }
            // He intentado crear un aviso para la excepcion en la que el usuario
             //       no introduze un archivo o no se encuentra
        /*
            if (o == null) {
                throw new InvalidDocument("Inavlid document","Enter another");
      /try(InvalidDocument e=new InvalidDocument()) {
        }catch(InvalidDocument e){
            System.out.println("No se ha podido cargar el archivo"+e.getMessage());
              }
         }

       */
                  }
              }

            }