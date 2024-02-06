import java.util.Scanner;

public class precioDescuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        double porcentajeDescuento = 0.15;

        double montoDescuento = totalCompra * porcentajeDescuento;

        double montoFinal = totalCompra - montoDescuento;

        System.out.println("El monto del descuento es: " + montoDescuento);
        System.out.println("El monto final a pagar es: " + montoFinal);

        scanner.close();
    }
}
