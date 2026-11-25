package guiaDidaticoPT5;

public class Exercicio01 {
    static void main() {
        try {
            int[] numeros = {5, 0};

            int resultado = numeros[0] / numeros[1];
            System.out.println(resultado);
        }catch (ArithmeticException e) {
            System.out.println("Erro mensagem: " + e.getMessage());
            System.out.println("Tipo mensagem: " + e.getClass().getSimpleName());
        }
    }
}
