package OopLessons.Lesson_3_5;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Valera",28, "Catsitter");
        employee.display();
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name);
    }
}

class Employee extends Person{
    private String jobTitle;

    public Employee(
        String name,
        int age,
        String jobTitle
    ){
        super(name, age);
        this.jobTitle = jobTitle;
    }
    @Override
    public void display(){
        System.out.printf(
            "%s,%d works as a %s \n",
            this.name,
            this.age,
            this.jobTitle
        );
    }
}
