package Exercise5;

public enum Activity {
    NEW(40),INACTIVE(30),ABNORMAL(50),FREQUENT(10);

    private int portage;

    Activity(int portage) {
        this.portage = portage;
    }

    public int getPortage() {
        return portage;
    }
}
