package Stream_Exercices;

import java.io.*;

public class Maximo_minimo implements Serializable {
    //Implementa un programa qeu muestre los valores máximos y
    // mínimos del archivo numero.txt

    public static void main(String[] args) throws IOException {
        try (BufferedReader o = new BufferedReader(new FileReader("numeros.txt"))) {

            int max;
            int min;
            String linea = o.readLine();
        int line=Integer.parseInt(linea);
       max=min=line;
        while(linea!=null){
            linea = o.readLine();
            if(linea!=null){
                line=Integer.parseInt(linea);
                if(line>max){
                    max=line;
                    System.out.println(max);
                }
                if(line<min){
                    min=line;
                    System.out.println(min);
                }
            }

            }


        }

    }

    }


