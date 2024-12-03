package Programming.Unit1.Theme2.POO.src.Exercise5;

public class LIE {

    //PROPERTIES
    private ProfilePicture profilePicture;
    private Activity activity;
    private Profile profile;


    //CONSTRUCTOR

    public LIE(ProfilePicture profilePicture, Profile profile, Activity activity) {
        this.profilePicture = profilePicture;
        this.activity = activity;
        this.profile = profile;
    }

    public LIE(){}

    //METHODS
    public int calculateProbablyFalse(){
        int probability;
        probability = validatePercentage(profilePicture.getPortage() + profile.getPortage() + activity.getPortage());
        return probability;
    }

    private int validatePercentage(int probability){
        if (probability > 100) probability = 100;
        return probability;
    }



}
