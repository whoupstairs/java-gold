package T09.Q10;

public class Sample {
    public static void main(String[] args) {
        final var item = new Item("apple", 100);
        item.setPrice(-1);
        System.out.println(item.getName() + ":" + item.getPrice());
    }
}
