package T1.Q6;

public class Sample {
    private String message;
    public Test test(String value) {
        class A implements Test {
            @Override
            public void execute() {
                System.out.println(message + value);
            }
        }
        // Inner Classの変数は実質的にfinalである必要がある
        //value = "LocalClass";
        message = "Hello, ";
        return new A();
    }
}
