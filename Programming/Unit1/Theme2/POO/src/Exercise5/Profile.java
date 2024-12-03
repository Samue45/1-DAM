package Programming.Unit1.Theme2.POO.src.Exercise5;

public enum Profile {
    INCOMPLETE(40),UNCONSCIOUS(50), CONSCIOUS(10);

    private int portage;

    Profile(int portage){
        this.portage = portage;
    }

    public int getPortage(){
        return portage;
    }
}
