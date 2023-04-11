package OopLessons.Lesson_3_9;

public class Program {
    public static void main(String[] args) {
        Object tom = new Person("Tom");
        System.out.println(tom.toString());
        System.out.println(tom.hashCode());
        System.out.println(tom.getClass());
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return "Person " + name;
    }
}