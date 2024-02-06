import java.util.Scanner;

public class cobroGasolina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double GALONES_A_LITROS = 3.785;
        final double PRECIO_POR_LITRO = 100.0; // en Bolívares

        System.out.print("Ingrese la cantidad de galones surtidos: ");
        double galonesSurtidos = scanner.nextDouble();

        double litrosSurtidos = galonesSurtidos * GALONES_A_LITROS;

        double montoCobrar = litrosSurtidos * PRECIO_POR_LITRO;

        System.out.println("La cantidad surtida en litros es: " + litrosSurtidos + " litros");
        System.out.println("El monto a cobrar es: " + montoCobrar + " Bolívares");

        scanner.close();
    }
}
