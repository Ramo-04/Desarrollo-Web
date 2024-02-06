import java.util.Scanner;

public class calculadoraDinero {
    public static void main(String[] args) {

        int valorBillete50000 = 50000;
        int valorBillete20000 = 20000;
        int valorBillete10000 = 10000;
        int valorBillete5000 = 5000;
        int valorBillete2000 = 2000;
        int valorBillete1000 = 1000;
        int valorBillete500 = 500;
        int valorBillete100 = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        int N1 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        int N2 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        int N3 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        int N4 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        int N5 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        int N6 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 500: ");
        int N7 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 100: ");
        int N8 = scanner.nextInt();


        int totalDinero = N1 * valorBillete50000 +
                N2 * valorBillete20000 +
                N3 * valorBillete10000 +
                N4 * valorBillete5000 +
                N5 * valorBillete2000 +
                N6 * valorBillete1000 +
                N7 * valorBillete500 +
                N8 * valorBillete100;


        System.out.println("El total de dinero en el banco es: " + totalDinero + " Bolívares");


        scanner.close();
    }
}
