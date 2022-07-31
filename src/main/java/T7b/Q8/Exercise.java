package T7b.Q8;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        list.add(null);
        // list.add(10);
        // list.add(20);
        // list.add(30);

        for (Number n : list) {
            System.out.println(n);
        }

    }
}
