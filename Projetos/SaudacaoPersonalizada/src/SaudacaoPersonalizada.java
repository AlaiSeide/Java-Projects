import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name;
        name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
