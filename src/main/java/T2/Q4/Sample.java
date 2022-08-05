package T2.Q4;

public class Sample {
    public static void main(String[] args) {
        final var item = new Item.Builder(100)
                .with(b -> {
                    b.name = "orange";
                    b.price = 120;
                }).build();
        System.out.println(item);

    }
}
