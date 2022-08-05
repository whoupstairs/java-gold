package T09.Q10;

public class Order {
    private Item item;
    private double qty;

    public Order(Item item, double qty) {
        super();
        this.item = item;
        this.qty = qty;
    }

    public int getPrice() {
        final var result = (int) (qty * item.getPrice());
        return result;
    }

    public Item getItem() {
        return item;
    }

    public double getQty() {
        return qty;
    }
}
