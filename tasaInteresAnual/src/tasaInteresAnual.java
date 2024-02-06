import java.util.Scanner;

public class tasaInteresAnual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo (Bolívares X): ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese los intereses pagados (Bolívares Y): ");
        double interesesPagados = scanner.nextDouble();

        System.out.print("Ingrese el tiempo en años: ");
        int tiempoAnios = scanner.nextInt();

        double tasaInteresAnual = (interesesPagados * 100) / (montoPrestamo * tiempoAnios);

        System.out.println("La tasa de interés anual es: " + tasaInteresAnual + "%");

        scanner.close();
    }
}
