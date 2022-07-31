package T7b.Q2;

public class Currency2<T> {
    private T amount;
    public Currency2(T amount) {
        super();
        this.amount = amount;
    }

    public T getAmount() {
        return amount;
    }
}
