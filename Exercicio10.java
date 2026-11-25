package guiaDidaticoPT5;

@FunctionalInterface
interface Saudacao {
    void cumprimentar(String nome);
}

public class Exercicio10 {

    public static void main(String[] args) {

        Saudacao saudacao = nome ->
                System.out.println("Olá, " + nome + "! Seja bem-vindo.");

        saudacao.cumprimentar("Giovany");
    }
}