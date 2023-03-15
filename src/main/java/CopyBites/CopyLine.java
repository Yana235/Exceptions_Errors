package CopyBites;

import java.io.*;

public class CopyLine {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br= new BufferedReader(new FileReader("xanadu.txt"));
            //Sirve para optimizar código el BufferReader
            PrintWriter pw=new PrintWriter(new PrintWriter(new FileWriter("salida.txt")))){
            String linea=br.readLine();
            while(linea!=null) {
                pw.println(linea);
                linea=br.readLine();
            }

        }
    }
}
