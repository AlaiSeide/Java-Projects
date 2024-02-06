import java.util.Scanner;

public class EntradaDoUsuario {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto

        // Pedindo ao usuário para inserir sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        // Exibindo as informações inseridas pelo usuário
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
