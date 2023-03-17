package OopLessons.Lesson_3_8;

public class Program{

    public static void main(String[] args) {

        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);

        switch (b1.bookType) {
            case BELLETRE -> System.out.println("\nBelletre");
            case SCIENCE -> System.out.println("\nScience");
            case SCIENCE_FICTION -> System.out.println("\nScience fiction");
            case PHANTASY -> System.out.println("\nPhantasy");
        }

        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }

        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());

        Operation operation = Operation.SUM;
        System.out.println(operation.action(5,6));

    }
}
class Book{

    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type){

        bookType = type;
        this.name = name;
        this.author = author;
    }
}

enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}

enum Color{
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}

enum Operation{
    SUM{
        public int action(int x, int y){
            return x + y;
        }
    },
    SUBTRACT{
        public int action(int x, int y){
            return x - y;
        }
    },
    MULTIPLY{
        public int action(int x, int y){
            return x * y;
        }
    };
    public abstract int action(int x, int y);
}