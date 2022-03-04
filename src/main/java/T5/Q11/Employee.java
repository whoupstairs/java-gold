package T5.Q11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String telephone;
    private String others;

    public Employee(final String name, final String telephone, final String others) {
        super();
        this.name = name;
        this.telephone = telephone;
        this.others = others;
    }

    private void writeObject(final ObjectOutputStream out) throws IOException {
        System.out.println("write");
        out.writeObject(name);
        out.writeObject(telephone);
    }

    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("read");
        this.name = (String) in.readObject();
        this.telephone = (String)  in.readObject();
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", telephone=" + telephone + "]";
    }
}
