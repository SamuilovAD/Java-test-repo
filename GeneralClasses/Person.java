package GeneralClasses;

public class Person {
    String name;
    int age;

    public String address;
    private String phone;
    //initializer
    {
        name = "Undefined";
        age = 18;
    }

    public Person()
    {
        this("Undefined", 18);
    }
    public Person(String localName)
    {
        name = localName;
    }
    public Person(String localName, int age)
    {
        this.name = localName;
        this.age = age;

    }
    public void displayInfo()
    {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
    protected void displayPhone(){
        System.out.printf("Phone: %s \n", phone);
    }
}
