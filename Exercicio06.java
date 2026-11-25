package guiaDidaticoPT5;

import java.util.HashMap;

public class Exercicio06 {
    static void main(String[] args) {
        HashMap<String, Integer> produto = new HashMap<>();

        produto.put("Mouse", 3);
        produto.put("Computador", 4);
        produto.put("Teclado", 5);

        System.out.println(produto.get("Mouse"));
    }
}
