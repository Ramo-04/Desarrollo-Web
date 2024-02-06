import java.util.Scanner;

public class luzAseo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la lectura anterior (en Kwh): ");
        int lecturaAnterior = scanner.nextInt();

        System.out.print("Ingrese la lectura actual (en Kwh): ");
        int lecturaActual = scanner.nextInt();

        int diferenciaLecturas = lecturaActual - lecturaAnterior;

        double montoPagar = calcularMontoPagar(diferenciaLecturas);

        System.out.println("El monto a pagar por consumo de luz eléctrica y servicio de aseo urbano es: " + montoPagar + " Bs.");

        scanner.close();
    }

    private static double calcularMontoPagar(int diferenciaLecturas) {
        double costoPorKwh;

        if (diferenciaLecturas <= 100) {
            costoPorKwh = 2.622;
        } else if (diferenciaLecturas <= 300) {
            costoPorKwh = 79.78;
        } else if (diferenciaLecturas <= 500) {
            costoPorKwh = 89.52;
        } else {
            costoPorKwh = 97.95;
        }

        return diferenciaLecturas * costoPorKwh;
    }
}
