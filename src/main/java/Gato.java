public class Gato  {
    public String nombre;
    public int edad;
    public Gato(String nombre,int edad) throws GatoException {
        if(edad<0){
            throw new GatoException("Edad incorrecta");
        }
        this.edad=edad;
        this.nombre=nombre;

    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public void setEdad() throws GatoException{
        if(edad<0){
                throw new GatoException("Edad incorrecta");
        }
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String toString(){
        return "Nombre:"+edad+"Edad"+edad;
    }

}
