package T7.Q8;

public class Test<T> {
    T value;

    public Test(T value) {
        super();
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue() {
        this.value = value;
    }
}
