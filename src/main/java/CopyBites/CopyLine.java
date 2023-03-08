package CopyBites;

import java.io.*;

public class CopyLine {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br= new BufferedReader(new FileReader("xanadu.txt"));
            PrintWriter pw=new PrintWriter(new PrintWriter(new FileWriter("salida.png")))){
            String linea=br.readLine();

        }
    }
}
