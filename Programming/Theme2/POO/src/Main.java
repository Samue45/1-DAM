import Exercise5.Activity;
import Exercise5.LIE;
import Exercise5.Profile;
import Exercise5.ProfilePicture;

public class Main {
    public static void main(String[] args) {


        LIE li1 = new LIE(ProfilePicture.GENERIC, Profile.INCOMPLETE, Activity.NEW);
        System.out.println(li1.calculateProbablyFalse());

    }

}