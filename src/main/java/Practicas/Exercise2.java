package Practicas;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Exercise2 implements Serializable {

    public static void main(String[] args) throws IOException {
        try(FileReader fr=new FileReader("src/main/java/Practicas/quijote.txt");
            FileWriter fw=new FileWriter("quijote2.txt")){
    int d;
    d=fr.read();
    while(d!=-1){
        fw.write(d);
        d=fr.read();
    }
        }

    }
}
