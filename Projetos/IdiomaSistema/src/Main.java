import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // pegando o idioma
        Locale Language;
        Language = Locale.getDefault();
        System.out.println("Language: " + Language);
        //System.out.println(Locale.getDefault().getLanguage());

    }
}