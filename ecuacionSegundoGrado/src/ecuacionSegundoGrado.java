import java.util.Scanner;

public class ecuacionSegundoGrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        resolverEcuacionSegundoGrado(A, B, C);

        scanner.close();
    }

    private static void resolverEcuacionSegundoGrado(double A, double B, double C) {
        double discriminante = B * B - 4 * A * C;

        if (discriminante == 0) {
            // Si D = 0
            double X1 = -B / (2 * A);
            System.out.println("La solución es única: X1 = X2 = " + X1);
        } else if (discriminante > 0) {
            double raizDiscriminante = Math.sqrt(discriminante);
            double X1 = (-B + raizDiscriminante) / (2 * A);
            double X2 = (-B - raizDiscriminante) / (2 * A);
            System.out.println("Las soluciones son: X1 = " + X1 + " y X2 = " + X2);
        } else {
            System.out.println("La ecuación no tiene solución en los reales.");
        }
    }
}
