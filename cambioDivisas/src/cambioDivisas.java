import java.util.Scanner;

public class cambioDivisas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en chelines austríacos: ");
        double chelinesAustriacos = scanner.nextDouble();
        double pesetasAustriacos = chelinesAustriacos * 956.871;
        System.out.println("Equivalente en pesetas: " + pesetasAustriacos);

        System.out.print("Ingrese la cantidad en dracmas griegos: ");
        double dracmasGriegos = scanner.nextDouble();
        double francosFranceses = dracmasGriegos / 100 * 20.110;
        System.out.println("Equivalente en francos franceses: " + francosFranceses);

        System.out.print("Ingrese la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();
        double dolares = pesetas / 122.499;
        double lirasItalianas = pesetas / 9.289;
        System.out.println("Equivalente en dólares: " + dolares);
        System.out.println("Equivalente en liras italianas: " + lirasItalianas);

        scanner.close();
    }
}
