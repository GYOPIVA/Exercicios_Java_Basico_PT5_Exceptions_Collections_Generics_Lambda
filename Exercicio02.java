package guiaDidaticoPT5;

import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        try {
            Scanner ler = new Scanner(System.in);
            int[] numeros = new int[2];
            System.out.println("Digite um numero: ");
            numeros[0] = Integer.parseInt(ler.nextLine());
            System.out.println("Digite outro numero: ");
            numeros[1] = Integer.parseInt(ler.nextLine());

            System.out.printf("%d | %d%n", numeros[0], numeros[1]);

        }catch (NumberFormatException e) {
            System.out.println("Erro! Valor informado não é um numero válido:");
        }
    }
}
