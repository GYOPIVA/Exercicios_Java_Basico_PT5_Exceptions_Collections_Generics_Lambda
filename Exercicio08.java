package guiaDidaticoPT5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio08 {

    static void main() {

        List<Integer> id = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            id.add(i);
        }

        Iterator<Integer> iterator = id.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}