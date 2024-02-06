import java.util.Scanner;

public class calculoExpresiones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Ingrese el valor de C: ");
        int C = scanner.nextInt();

        System.out.print("Ingrese el valor de D: ");
        int D = scanner.nextInt();

        int resultado = 0;

        if (D == 0) {
            resultado = (A - C) * (A - C);
        } else if (D > 0) {
            resultado = ((A - B) * (A - B) * (A - B)) / D;
            if (resultado < 0) {
                resultado = 0;
            }
        } else {
            System.out.println("El valor de D no cumple con las condiciones especificadas.");
            return;
        }

        System.out.println("El resultado de la expresión es: " + resultado);

        scanner.close();
    }
}
