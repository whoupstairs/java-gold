package T1.Q3;

public class Outer {
    public static class Inner {
        Inner inner = new Inner();
        // Inner inner2 = new Outer().Inner();
        // Inner inner3 = Outer.new Inner();
        // Inner inner4 = new Outer().Inner();
        Inner inner5 = new Outer.Inner();
        Inner inner6 = Outer.Inner.this;

    }
}
