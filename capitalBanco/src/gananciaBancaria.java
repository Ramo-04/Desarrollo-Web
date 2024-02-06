//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class gananciaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        double tasaInteresMensual = 0.02;

        double gananciaMensual = capitalInicial * tasaInteresMensual;

        double saldoDespuesDeUnMes = capitalInicial + gananciaMensual;

        System.out.println("Después de un mes, la ganancia es: " + gananciaMensual);
        System.out.println("El saldo total después de un mes es: " + saldoDespuesDeUnMes);

        scanner.close();
    }
}
