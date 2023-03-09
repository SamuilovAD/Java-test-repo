public class Lesson_3_1_Classes {
    public static void main(String[] args)
    {
        Person tom = new Person();
        tom.age = 99;
        tom.name = "Tom";
        tom.displayInfo();
        Person dan = new Person("Dan");
        tom.displayInfo();
        dan.displayInfo();
    }
}

class Person
{
    String name;
    int age;
    //initializer
    {
        name = "Undefined";
        age = 18;
    }

    Person()
    {
        this("Undefined", 18);
    }
    Person(String localName)
    {
        name = localName;
    }
    Person(String localName, int age)
    {
        this.name = localName;
        this.age = age;

    }
    public void displayInfo()
    {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}