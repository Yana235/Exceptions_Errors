package CopyBites;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCars {
    public static void main(String[] args) throws IOException {
        //Especificos para textos
        try(FileReader fr= new FileReader("xanadu.txt");
            FileWriter fw= new FileWriter("salida.txt")){
            int c;
            c=fr.read();
            while(c!=-1){
                fw.write(c);
                c= fr.read();
            }
        }
    }
}
