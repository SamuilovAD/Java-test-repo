public class Lesson_2_3_arithmetic {
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.printf("Result: %d \n", c);

        int e = 4;
        int f = 5;
        System.out.printf("Result: %d \n", e*f);

        int a1 = 8;
        int b2 = 7;
        int c3 = a1 + 5 * ++b2;
        System.out.println(c3);  // 48
    }
}
