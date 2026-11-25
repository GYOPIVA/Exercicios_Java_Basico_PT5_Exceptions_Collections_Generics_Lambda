package guiaDidaticoPT5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

       for (int i = 1; i <= 3; i++) {
           System.out.println("Digite um nome: ");
           nomes.add(sc.nextLine());
       }

        System.out.printf("Quantidade de nomes: %d%n" +
                "Elemento do índice 1: %s%n" +
                "Nomes: %s", nomes.size(), nomes.get(0), nomes);
    }
}
