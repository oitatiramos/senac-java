import java.util.ArrayList;
import java.util.List;

public class AppMatriz {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Vanessa";
        String nome3 = "Antonio";

        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);

        List<String> nomes = new ArrayList<String>();

        nomes.add("Tatiane");
        nomes.add("Pedro");
        nomes.add("Mauro");

        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
