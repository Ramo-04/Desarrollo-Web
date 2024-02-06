import java.util.Scanner;

public class imprimirDescendente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();

        System.out.print("Ingrese el valor de K (debe ser menor que N): ");
        int K = scanner.nextInt();

        if (K >= N) {
            System.out.println("Error: K debe ser menor que N.");
        } else {
            ImprimirDescendente(N, K);
        }

        scanner.close();
    }

    private static void ImprimirDescendente(int N, int K) {
        System.out.println("Los valores desde " + N + " hasta " + K + " son:");

        for (int i = N; i >= K; i--) {
            System.out.println(i);
        }
    }
}
