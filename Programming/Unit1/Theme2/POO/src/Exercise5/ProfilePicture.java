package Programming.Unit1.Theme2.POO.src.Exercise5;

public enum ProfilePicture {
    GENERIC(40), LITTLE_CLARE(30), SUSPICIOUS(50), NATURAL(10);

    private int portage;

    ProfilePicture(int portage) {
        this.portage = portage;
    }

    public int getPortage() {
        return portage;
    }
}
