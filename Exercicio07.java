package guiaDidaticoPT5;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio07 {
    static void main(String[] args) {
        Queue<String> chamados = new LinkedList<>();

        chamados.add("Chamado #001");
        chamados.add("Chamado #002");
        chamados.add("Chamado #003");

        System.out.println(chamados);

        String removido = chamados.poll();

        System.out.println(chamados);

        //exemplo com peek
        Queue<String> chamados2 = new LinkedList<>();
        chamados2.add("Chamado #001");
        chamados2.add("Chamado #002");
        chamados2.add("Chamado #003");
        String chamado = chamados2.peek();
        System.out.println(chamado);

        Queue<String> suporte = new LinkedList<>();

        suporte.add("Problema na impressora");
        suporte.add("Computador não liga");
        suporte.add("Troca de senha");

        System.out.println(suporte.poll());

//        Queue = Fila
//
//        add()  -> entra no final
//
//        poll() -> remove do início
//
//        peek() -> consulta o início
    }
}
