import java.util.ArrayList;

public class ComparacaoMedias {
    public static void main(String[] args) {
        // Array de Notas para duas turmas
        double[] notasTurmaA = {8.5, 7.2, 9.0, 6.8, 8.0};
        double[] notasTurmaB = {7.0, 6.5, 8.5, 9.2, 7.8};

        // Cálculo de Médias
        double mediaTurmaA = calcularMedia(notasTurmaA);
        double mediaTurmaB = calcularMedia(notasTurmaB);

        // Lista de Médias
        ArrayList<Double> medias = new ArrayList<>();
        medias.add(mediaTurmaA);
        medias.add(mediaTurmaB);

        // Comparação e Exibição
        if (mediaTurmaA > mediaTurmaB) {
            System.out.println("A Turma A teve uma média mais alta: " + mediaTurmaA);
        } else if (mediaTurmaA < mediaTurmaB) {
            System.out.println("A Turma B teve uma média mais alta: " + mediaTurmaB);
        } else {
            System.out.println("As duas turmas tiveram a mesma média: " + mediaTurmaA);
        }
    }

    // Método para calcular a média de um array de notas
    private static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}



