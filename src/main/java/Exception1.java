import java.util.InputMismatchException;
import java.util.Scanner;


public class Exception1 {

    public static void main(String[]args) throws InputMismatchException
    ,ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pide número");
        int A = sc.nextInt();
        int B = sc.nextInt();
        String A2 = "";
        String A3 = "";

/*
        if (B == 0) {
            throw new ArithmeticException("No puede ser 0");
        }
        if (A == Integer.parseInt(A2) || B == Integer.parseInt(A3)) {
            throw new InputMismatchException("Debe ser un número");
        } else {

        }

 */
        try {
            int result = A / B;
            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("Debe ser un número"+ e.getMessage());
        }catch(ArithmeticException a){
            System.out.println("No puede ser 0"+a.getMessage());
        }


    }


}
