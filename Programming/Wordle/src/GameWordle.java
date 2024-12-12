import java.util.Random;

public class GameWordle implements IWordle{
    //Random object to generate a random number
    Random random = new Random();

    @Override
    public void Playwordle() {

    }

    @Override
    public String generarPalabraSecreta() {
        String randomWords[] = {"TIMÓN","CAFETERA","LIBRO","GAFAS"};
        int randomNumber = random.nextInt(0,randomWords.length-1);

        return randomWords[randomNumber];
    }

    @Override
    public TiposWordle letraPertenece(String palabraSecreta, char letra, int pos) {



        return null;
    }

    @Override
    public TiposWordle[] getAciertos(String palabraSecreta, String palabra) {

        
        return new TiposWordle[0];
    }

    @Override
    public boolean acertado(TiposWordle[] aciertos) {
        return false;
    }

    @Override
    public void printlnColores(String palabra, TiposWordle[] aciertos) {

    }
}
