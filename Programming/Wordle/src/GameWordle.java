public class GameWordle implements IWordle{
    @Override
    public void Playwordle() {

    }

    @Override
    public String generarPalabraSecreta() {
        return "";
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
