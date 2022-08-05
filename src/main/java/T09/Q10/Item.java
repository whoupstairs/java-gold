package T09.Q10;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        super();
        this.name = name;
        this.price = price;

        assert this.name != null : "name is null";
        assert this.price > 0 : "invalid price:" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        assert name != null : "name is null";
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        assert price > 0 : "invalid price : " + price;
        this.price = price;
    }
}
