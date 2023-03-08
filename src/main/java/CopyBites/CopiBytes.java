package CopyBites;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiBytes {
    public static void main(String[] args) throws IOException {

        //Trata cualquier archivo (byts),tambien textos
        try (FileInputStream fi = new FileInputStream("xanadu.txt");
             FileOutputStream fo = new FileOutputStream("salida.txt")) {

            int c;
            c = fi.read();
            while (c != -1) {
                fo.write(c);
                c = fi.read();

            }
            /*
        }finally{
            if(fi!=null){
                fi.close();
            }
            if(fo!=null){
                fo.close();
            }

        }

             */

        }

    }
}
