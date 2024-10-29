
import Exercise2.*;

public class Main {
    public static void main(String[] args) {


        Hour hour = new Hour(HourType.SYSTEM);
        Birthday dateOfBorn = new Birthday(8,10,1980);

        Runner runner1 = new Runner("Paco",TypeSex.MALE,dateOfBorn,hour);
        System.out.println(runner1);
        System.out.println(runner1.isOld());

    }

}