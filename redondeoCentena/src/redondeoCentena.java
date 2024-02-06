import java.util.Scanner;

public class redondeoCentena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dígito A: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese el dígito B: ");
        int B = scanner.nextInt();

        System.out.print("Ingrese el dígito C: ");
        int C = scanner.nextInt();

        System.out.print("Ingrese el dígito D: ");
        int D = scanner.nextInt();

        int N = A * 1000 + B * 100 + C * 10 + D;

        int residuo = N % 100;
        int redondeoCentena = N - residuo + ((residuo >= 50) ? 100 : 0);

        System.out.println("Número ingresado: " + N);
        System.out.println("Resultado redondeado a la centena más próxima: " + redondeoCentena);

        scanner.close();
    }
}
