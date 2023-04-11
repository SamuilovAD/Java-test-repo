package OopLessons;

public class Lesson_3_11 {
    public static void main(String[] args) {
        Account<String> accountString = new Account<String>("1234", 667);
        Accountable<String> accountableString = new AccountTypedString("1234", 667);
    }

}

class Account<T> {

    private T id;
    private int sum;

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

interface Accountable<T> {
    public T getId();

    public int getSum();

    public void setSum(int sum);
}

class AccountTypedString implements Accountable<String> {

    private String id;
    private int sum;

    public AccountTypedString(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}