package T2.Q7;

public class OldSample {
    public static void main(String[] args) {
        final var sample = new Person(Person.Gender.MALE, 19);

        if (sample.getGender().equals(Person.Gender.MALE)
            || sample.getGender().equals(Person.Gender.FEMALE)
                && sample.getAge() >= 20) {
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
}
