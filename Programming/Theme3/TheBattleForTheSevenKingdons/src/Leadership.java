public enum Leadership {
    LITTLE(10),MEDIA(30), HIGH(50);

    private int leadership;

    Leadership(int leadership){
        this.leadership = leadership;
    }

    public int getLeadership() {
        return leadership;
    }
}

