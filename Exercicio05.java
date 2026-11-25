package guiaDidaticoPT5;

import java.util.HashSet;

public class Exercicio05 {
    static void main() {
        HashSet<String> alunos = new HashSet<>();
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Ana");
        alunos.add("Carlos");
        alunos.add("Bruno");

        System.out.println(alunos);
        if(alunos.contains("Ana")){
            System.out.println("Nome encontrado!");
        }
    }
}
