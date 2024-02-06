import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en metros: ");
        double metros = scanner.nextDouble();


        double pulgadasTotales = metros * 39.27;


        int pies = (int) (pulgadasTotales / 12);
        double pulgadasRestantes = pulgadasTotales % 12;


        System.out.println(metros + " metros son aproximadamente " + pies + " pies y " + pulgadasRestantes + " pulgadas.");


        scanner.close();
    }
}
