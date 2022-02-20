import java.util.ArrayList;
import java.util.List;

public class Escada {
    public static void main(String[] args) {
        int qtdDegraus = 6;
        List<String> degraus = new ArrayList<>();

        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
        }

        for (String d : degraus ) {
            System.out.println(d);
        }
    }
}
