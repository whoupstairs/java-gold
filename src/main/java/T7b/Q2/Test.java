package T7b.Q2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Value v = new Value<>("Hello");
        Object a = v.getVal();

        List list = new ArrayList<>();
        list.add(10);
        list.add("Java");
        list.add(new Object());

        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            System.out.println(list.get(i));
        }


    }
}
