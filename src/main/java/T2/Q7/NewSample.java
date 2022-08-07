package T2.Q7;

import java.util.function.Predicate;

public class NewSample {
    public static void main(String[] args) {
        Predicate<Person> isMale = p -> p.getGender().equals(Person.Gender.MALE);
        Predicate<Person> isFemale = p -> p.getGender().equals(Person.Gender.FEMALE);
        Predicate<Person> isAdult = p -> p.getAge() >= 20;

        Predicate<Person> criteria = isMale.or(isFemale.and(isAdult));

        Person sample = new Person(Person.Gender.MALE, 19);

        if (criteria.test(sample)) {
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
}
