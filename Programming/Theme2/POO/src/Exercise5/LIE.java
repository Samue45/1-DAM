package Exercise5;

public class LIE {

    //PROPERTIES
    SocialProfile socialProfile;
    int solution;

    //CONSTRUCTOR
    public LIE(){}

    //METHODS
    public void calculateProbablyFalse(){
        switch (socialProfile.getProfilePicture()){
            case GENERIC -> {
                solution += 40 ;
            }
            case LITTLE_CLARE -> {
                solution += 30;
            }
            case SUSPICIOUS -> {
                solution += 50;
            }
            case NATURAL -> {
                solution += 10;
            }
        }

        switch (socialProfile.getProfile()){
            case INCOMPLETE -> {
                solution += 40;
            }
            case UNCONSCIOUS -> {
                solution += 50;
            }
        }

        switch (socialProfile.getActivity()){}

    }



}
