package T4.Q23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSample {
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item(1, ItemType.BOOK, "Java", 1980),
                new Item(2, ItemType.BOOK, "Lambda", 2980),
                new Item(3, ItemType.MAGAZINE, "Software", 980),
                new Item(4, ItemType.MAGAZINE, "Test", 1280)
        );

        final var books = list.stream()
                .filter(item -> item.getType() == ItemType.BOOK)
                .collect(Collectors.toList());

        books.forEach(System.out::println);

        System.out.println("------------------------------");

        final var books2 = list.stream()
                .filter(item -> item.getType() == ItemType.BOOK)
                .collect(Collectors.toSet());

        books2.forEach(System.out::println);
        System.out.println("------------------------------");


        final var map = list.stream()
                .collect(Collectors.toMap(
                        Item::getName,
                        item -> item
                ));

        //map.forEach((k, v) -> System.out.println(k + ":" + v));
        //System.out.println("------------------------------");


        //books.forEach(System.out::println);

        map.keySet().stream().forEach(System.out::println);
        //map.values().stream().forEach(System.out::println);
    }
}
