package OopLessons.Lesson_3_14;

import GeneralClasses.PersonClean;

public class Program
{
    public static void main(String[] args)
    {
        PersonClean personClean = new PersonClean("Test");
        System.out.println(personClean.getName());
        changePerson(personClean);
        System.out.println(personClean.getName()); // Test - изменения не произошло
        // personClean хранит ссылку на старый объект
    }

    private static void changePerson(PersonClean personClean)
    {
        personClean = new PersonClean("Qwerty");
    }
}
