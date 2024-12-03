package Programming.Unit1.Theme2.POO.src;

import Programming.Unit1.Theme2.POO.src.Exercise5.Activity;
import Programming.Unit1.Theme2.POO.src.Exercise5.LIE;
import Programming.Unit1.Theme2.POO.src.Exercise5.Profile;
import Programming.Unit1.Theme2.POO.src.Exercise5.ProfilePicture;

public class Main {
    public static void main(String[] args) {


        LIE li1 = new LIE(ProfilePicture.GENERIC, Profile.INCOMPLETE, Activity.NEW);
        System.out.println(li1.calculateProbablyFalse());

    }

}