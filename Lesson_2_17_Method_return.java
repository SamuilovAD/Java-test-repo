public class Lesson_2_17_Method_return
{
    public static void main (String[] args)
    {
        daytime(7);     // Good morning
        daytime(13);    // Good after noon
        daytime(32);    //
        daytime(56);    //
        daytime(2);     // Good night
    }
    static void daytime(int hour)
    {
        if (hour >24 || hour < 0)
            return;
        if(hour > 21 || hour < 6)
            System.out.println("Good night");
        else if(hour >= 15)
            System.out.println("Good evening");
        else if(hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}
