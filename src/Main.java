import java.util.*;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Илья", "Потемкин-Таврический", 12));
        people.add(new Person("Олег", "Илларионов-Голеншцев-Кутузов", 8));
        people.add(new Person("Андрей", "Коновалов", 15));
        people.add(new Person("Никита", "Мартынюк", 7));
        people.add(new Person("Антон", "Орлов-Чесменский", 19));
        people.add(new Person("Федор", "Березьев", 20));

        System.out.println(people);
        Collections.sort(people, new PersonStatusComporator());
        System.out.println(people);

        Predicate<Person> adult = Person -> Person.getAge() <= 18;
        people.removeIf(adult);
        System.out.println(people);
    }
}
