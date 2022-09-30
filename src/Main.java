import java.util.*;


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
        Collections.sort(people, (o1, o2) -> {
            if (Integer.compare(Person.getWordCount(o1.getSurname()), Person.getWordCount(o2.getSurname())) != 0) {
                return Integer.compare(Person.getWordCount(o1.getSurname()), Person.getWordCount(o2.getSurname()));
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(people);
    }
}
