package T09.Q10;

public class Main {
    public static void main(String[] args) {
        String name = args[0];
        int price = Integer.parseInt(args[1]);
        double qty = Double.parseDouble(args[2]);

        final var item = new Item(name, price);
        final var order = new Order(item, qty);

        assert order.getPrice() == (int)(price * qty) : "invalid result getPrice()";

        System.out.println("total price :" + order.getPrice());

    }
}
