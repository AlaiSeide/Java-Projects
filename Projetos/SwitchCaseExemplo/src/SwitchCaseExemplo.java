import java.util.Scanner;

public class SwitchCaseExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaDaSemana;
        System.out.println("Digite o dia da semana (ex: 1,2...)");
        diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
