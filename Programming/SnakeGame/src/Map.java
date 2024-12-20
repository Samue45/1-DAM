public class Map {

    //Properties
    private int[][] map;

    //Constructor

    public Map(int[][] map) {
        //The map size always is 35x35
        this.map = new int[35][35];
    }

    //Getter and Setter

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }
}
