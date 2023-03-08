import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args)throws InputMismatchException {

        try {
            pedirNumero();

        } catch (InputMismatchException a) {
            System.out.println("Solo admite numeros" + a.getMessage());
        }

    }

    public static double pedirNumero() {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];

        for (int i = 0; i > vector.length; i++) {
            System.out.println("Dame un número decimal :");
             vector[i] = sc.nextDouble();
        }
        //Esta mal echo
        return vector[4];
    }
}

