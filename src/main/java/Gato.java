import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gato  implements Serializable {
    public String nombre;
    public int edad;

    public Gato(String nombre, int edad) throws GatoException {
        if(nombre.length()<3)
            throw new GatoException("Nombre de gato incorrecto");
        if (edad < 0) {
            throw new GatoException("Edad incorrecta");
        }
        this.edad = edad;
        this.nombre = nombre;

    }

    public void setNombre()  throws GatoException {
        if(nombre.length()<3)
            throw new GatoException("Nombre de gato incorrecto");
        this.nombre = nombre;
    }

    public void setEdad() throws GatoException {
        if (edad < 0) {
            throw new GatoException("Edad incorrecta");
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public static void save(List<Gato> cats, String file) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(file)))){
            for(Gato cat:cats){
                out.writeObject(cat);
            }
        }
    }

    public static List<Gato> load(String file) throws IOException,ClassNotFoundException {
        try(ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(file)))) {
            List<Gato> cats = new ArrayList<>();
            Gato cat = (Gato) in.readObject();
            while(cat != null){
                cats.add(cat);
                try{
                    cat = (Gato) in.readObject();
                } catch (EOFException e){
                    break;
                }
            }
            return cats;
        }
    }
    public String toString() {
        return "Nombre:" + edad + "Edad" + edad;
    }

    //  IOException ->Lanzar excepciones
    // ObjectOutputStream ->Crea un objeto
    //BufferedOutputStream->Optimizar un método
    //FileOutputStream-> Crea un archivo
    //writeObject-> La lista de objetos la escribes en un fichero



}




