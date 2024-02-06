public class Fatorial {
    // Função recursiva para calcular o fatorial
    public static void main(String[] args) {
        // Chamando a função fatorial e exibindo o resultado
        int resultado = fatorial(5);
        System.out.println("O fatorial de 5 é: " + resultado);
    }

    // Função fatorial
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
