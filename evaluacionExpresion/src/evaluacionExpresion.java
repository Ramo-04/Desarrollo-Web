import java.util.Scanner;

public class evaluacionExpresion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de P: ");
        int P = scanner.nextInt();

        System.out.print("Ingrese el valor de Q: ");
        int Q = scanner.nextInt();

        int resultado = P * P * P + Q * Q * Q * Q - 2 * P * P;

        if (resultado > 680) {
            System.out.println("Los valores de P y Q satisfacen la expresión:");
            System.out.println("P = " + P);
            System.out.println("Q = " + Q);
        } else {
            System.out.println("Los valores de P y Q no satisfacen la expresión.");
        }

        scanner.close();
    }
}
