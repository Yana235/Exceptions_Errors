package Practicas;

public class InvalidDocument extends Exception{
    public InvalidDocument(){
        super();
    }
    public InvalidDocument(String message,String path){
        super(path + ((message == null)
                ? ""
                : " (" + message + ")"));
    }

}
