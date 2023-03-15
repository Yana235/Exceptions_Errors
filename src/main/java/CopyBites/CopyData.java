package CopyBites;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {

    static final String dataFile = "invoicedata";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };


    public static void main(String[]args){
        try {
            save(dataFile);
        }catch(IOException pepe){

        }
    }
    public static void save(String fichero) throws IOException{
        try(DataOutputStream out= new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)))){

        }catch(IOException e){

        }

    }
}
