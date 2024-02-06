import java.util.Scanner;

public class ingresoMaiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = 452; // kilogramos de harina obtenidos
        int N = 197; // litros de aceite obtenidos
        double B1 = 132.0; // precio por bulto de harina (24 paquetes de 1 kg)
        double B2 = 180.0; // precio por caja de aceite (15 envases de 1 litro)
        double B3 = 7.50; // precio por kilogramo de harina al detalle
        double B4 = 14.50; // precio por litro de aceite al detalle

        int bultosHarina = M / 24;
        int cajasAceite = N / 15;

        double ingresoBultosHarina = bultosHarina * B1;
        double ingresoCajasAceite = cajasAceite * B2;

        double ingresoDetalleHarina = (M % 24) * B3;
        double ingresoDetalleAceite = (N % 15) * B4;

        double ingresoTotal = ingresoBultosHarina + ingresoCajasAceite + ingresoDetalleHarina + ingresoDetalleAceite;

        System.out.println("El ingreso total por la venta de cada tonelada de maíz es de Bs. " + ingresoTotal);

        scanner.close();
    }
}
