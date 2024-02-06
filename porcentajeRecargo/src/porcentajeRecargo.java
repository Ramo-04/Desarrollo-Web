import java.util.Scanner;

public class porcentajeRecargo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio al contado (Bs. P): ");
        double precioContado = scanner.nextDouble();

        System.out.print("Ingrese el número de cuotas: ");
        int numeroCuotas = scanner.nextInt();

        double totalPlazos = precioContado + (12 * numeroCuotas);

        double porcentajeRecargo = ((totalPlazos - precioContado) / precioContado) * 100;

        System.out.println("El total a plazos es de Bs. " + totalPlazos);
        System.out.println("El porcentaje de recargo es del " + porcentajeRecargo + "%");

        scanner.close();
    }
}
