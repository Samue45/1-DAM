package Exercise5;

public class SocialProfile {

    //PROPERTIES
    private ProfilePicture profilePicture;
    private Profile profile;
    private Activity activity;

    //CONSTRUCTOR

    public SocialProfile(ProfilePicture profilePicture, Profile profile, Activity activity) {
        this.profilePicture = profilePicture;
        this.profile = profile;
        this.activity = activity;
    }

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
