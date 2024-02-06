import java.util.Scanner;

public class calculoIntereses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero en inversión: $");
        double inversionInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteresAnual = scanner.nextDouble();

        double interesesGenerados = inversionInicial * (tasaInteresAnual / 100);

        System.out.println("Los intereses generados son: $" + interesesGenerados);

        if (interesesGenerados > 7000) {
            double nuevoSaldo = inversionInicial + interesesGenerados;

            System.out.println("Después de reinvertir los intereses, el nuevo saldo es: $" + nuevoSaldo);
        } else {
            System.out.println("Los intereses no exceden a $7000. No se reinvertirán.");
        }

        scanner.close();
    }
}
