import Theme1.Calculator;
import Theme2.Person;
import Theme3.Notes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Exercise 1
        Calculator calculator1 = new Calculator();
        calculator1.useCalculator();

        //Exercise 2
        Person person1 = new Person("Samuel",19,"Jerez");
        System.out.println(person1.toString());

        person1.incrementAgeIn1();

        System.out.println(person1.toString());

        //Exercise 3
        Notes notes = new Notes();

        System.out.println(Arrays.toString(notes.saveNotes()));
        System.out.println(Arrays.toString(notes.invertArray()));
    }
}
