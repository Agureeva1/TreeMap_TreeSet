import java.util.Comparator;

public class PersonStatusComporator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (Integer.compare(Person.getWordCount(o1.getSurname()), Person.getWordCount(o2.getSurname())) != 0) {
            return Integer.compare(Person.getWordCount(o1.getSurname()), Person.getWordCount(o2.getSurname()));
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
