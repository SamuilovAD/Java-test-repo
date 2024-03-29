package OopLessons.Lesson_3_7;

public class Program{

    public static void main(String[] args) {
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
        Printable p = new Journal("Foreign Affairs");
        p.print();
        // Интерфейс не имеет метода getName, необходимо явное приведение
        String name = ((Journal)p).getName();
        System.out.println(name);
    }
}
interface Printable{
    default void print(){
        System.out.println("Undefined printable");
    }
}
class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}