import java.util.Comparator;

public class Person {

    private String name;
    private String surname;
    private int age;


    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
// создайте toString

    @Override
    public String toString() {
        return name + " " + surname + " " + "(" + age + " лет)";
    }

    public static int getWordCount(String surname) {
        int count = 1;
        for (int i = 0; i < surname.length(); i++) {
            if (surname.charAt(i) == '-') {
                count++;
            }
        }// System.out.println("Фамилия " + surname + " состоит из " + count + " слов");
        return count;
    }

}
