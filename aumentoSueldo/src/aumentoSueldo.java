import java.util.Scanner;

public class aumentoSueldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del trabajador (Bs.): ");
        double sueldo = scanner.nextDouble();

        double tasaAumentoMenor40000 = 0.15; // 15%
        double tasaAumentoMayor40000 = 0.12; // 12%

        double nuevoSueldo;
        if (sueldo < 40000) {
            nuevoSueldo = sueldo * (1 + tasaAumentoMenor40000);
        } else {
            nuevoSueldo = sueldo * (1 + tasaAumentoMayor40000);
        }

        System.out.println("El nuevo sueldo del trabajador es: Bs. " + nuevoSueldo);

        scanner.close();
    }
}
