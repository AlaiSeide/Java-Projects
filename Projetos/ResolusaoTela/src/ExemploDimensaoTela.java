import java.awt.Dimension;
import java.awt.Toolkit;

public class ExemploDimensaoTela {
    public static void main(String[] args) {
        // Obtém a dimensão da tela
        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Largura da Tela: " + dimensaoTela.getWidth());
        System.out.println("Altura da Tela: " + dimensaoTela.getHeight());
    }
}
