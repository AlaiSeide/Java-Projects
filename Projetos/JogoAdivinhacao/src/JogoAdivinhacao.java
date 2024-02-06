import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(1, 11); // Gera número aleatório entre 1 e 10
        int tentativas = 3;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        while (tentativas > 0) {
            System.out.print("Insira seu palpite (entre 1 e 10): ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else {
                System.out.println("Tente novamente.");

                if (palpite < numeroAleatorio) {
                    System.out.println("Dica: O número é maior.");
                } else {
                    System.out.println("Dica: O número é menor.");
                }

                tentativas--;
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }

        if (tentativas == 0) {
            System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
