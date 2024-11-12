import java.util.Scanner;

class Modularizacao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = lerNumero(scanner);
        boolean isPrimo = verificarPrimo(numero);
        mostrarResultado(numero, isPrimo);

        scanner.close();
    }

    private static int lerNumero(Scanner scanner) {
        System.out.print("Digite um número: ");
        return scanner.nextInt();
    }

    private static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void mostrarResultado(int numero, boolean isPrimo) {
        if (isPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
