public class Lesson_2_1_2_Types {
    public static void main(String args[])
    {
        boolean boolVar = true;
        byte byteVar = 127;
        short shortVar = -21768;
        int intVar = 2147483647;
        long longVar = 2147483649L;
        double doubleVar = 12345456.99999;
        float floatVar = 12345451.99F;

        char chavVar = 'f';
        char chavVarNumber = 102;
        char charVar16='\u0066';
        String text = "Hello \nworld";
        String text2 = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        String text3 = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(boolVar);
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(doubleVar);
        System.out.println(floatVar);
        System.out.println(chavVarNumber);
        System.out.println(chavVar);
        System.out.println(charVar16);
        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
    }
}
