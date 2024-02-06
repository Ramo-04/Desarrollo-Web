import java.util.Scanner;

public class clasificacionTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado A: ");
        int ladoA = scanner.nextInt();

        System.out.print("Ingrese la longitud del lado B: ");
        int ladoB = scanner.nextInt();

        System.out.print("Ingrese la longitud del lado C: ");
        int ladoC = scanner.nextInt();

        if (esTriangulo(ladoA, ladoB, ladoC)) {
            String clasificacion = clasificarTriangulo(ladoA, ladoB, ladoC);
            double area = calcularArea(ladoA, ladoB, ladoC);

            System.out.println("Las longitudes corresponden a un triángulo " + clasificacion);
            System.out.println("Área del triángulo: " + area);
        } else {
            System.out.println("Las longitudes no corresponden a un triángulo.");
        }

        scanner.close();
    }

    public static boolean esTriangulo(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String clasificarTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilátero";
        } else if (a == b || b == c || a == c) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

    private static double calcularArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return(s * (s - a) * (s - b) * (s - c));
    }
}
