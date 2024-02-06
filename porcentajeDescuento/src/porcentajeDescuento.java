import java.util.Scanner;

public class porcentajeDescuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio final pagado por el producto: ");
        double precioFinal = scanner.nextDouble();

        System.out.print("Ingrese el precio de venta al público (PVP): ");
        double pvp = scanner.nextDouble();

        double porcentajeDescuento = ((pvp - precioFinal) / pvp) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + porcentajeDescuento + "%");

        scanner.close();
    }
}
