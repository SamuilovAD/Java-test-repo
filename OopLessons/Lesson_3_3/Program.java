package OopLessons.Lesson_3_3;

import GeneralClasses.PersonClean;

public class Program
{
    public static void main(String[] args)
    {
        PersonClean personClean = new PersonClean("Test");
        System.out.println(personClean.getAddress());
    }
}
