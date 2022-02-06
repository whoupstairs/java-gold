package T4.Q10;

import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        for (Integer num : a) {
            System.out.println(num);
        }
        a.stream().forEach(System.out::println);

    }
}
