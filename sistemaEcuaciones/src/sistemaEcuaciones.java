import java.util.Scanner;

public class sistemaEcuaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextDouble();

        System.out.print("Ingrese el valor de e: ");
        double e = scanner.nextDouble();

        System.out.print("Ingrese el valor de f: ");
        double f = scanner.nextDouble();

        double determinantePrincipal = a * e - b * d;
        double determinanteX = c * e - b * f;
        double determinanteY = a * f - c * d;

        double solucionX = determinanteX / determinantePrincipal;
        double solucionY = determinanteY / determinantePrincipal;

        System.out.println("El valor de X es: " + solucionX);
        System.out.println("El valor de Y es: " + solucionY);

        scanner.close();
    }
}
