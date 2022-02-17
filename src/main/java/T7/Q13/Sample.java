package T7.Q13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
    public static void main(String[] args) {

        //Set<String> set = new TreeSet<>();
        Set<String> set = new HashSet<>();
        set.add("B");
        set.add("D");
        set.add("A");
        set.add("C");
        set.add("A");

        set.stream().forEach(System.out::println);

    }
}
