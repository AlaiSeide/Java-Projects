public class EstruturaCondicional {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 0) {
            System.out.println("The number is positive. " + numero);
        } else if (numero < 0) {
            System.out.println("The number is negative. " + numero);
        } else {
            System.out.println("The number is zero. " + numero);
        }
    }
}

