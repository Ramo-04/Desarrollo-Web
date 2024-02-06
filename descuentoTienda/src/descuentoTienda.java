import java.util.Scanner;

public class descuentoTienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el monto de la compra: $");
        double montoCompra = scanner.nextDouble();

        double descuento = 0.0;

        if (montoCompra < 500) {
            descuento = 0.0;
        } else if (montoCompra <= 1000) {
            descuento = 0.05 * montoCompra;
        } else if (montoCompra <= 7000) {
            descuento = 0.11 * montoCompra;
        } else if (montoCompra <= 15000) {
            descuento = 0.18 * montoCompra;
        } else {
            descuento = 0.25 * montoCompra;
        }

        double montoPagar = montoCompra - descuento;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Descuento recibido: $" + descuento);
        System.out.println("Monto a pagar: $" + montoPagar);

        scanner.close();
    }
}
