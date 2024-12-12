public interface IWordle {

    public void Playwordle(); // m�todo principal d�nde se juega
    public String generarPalabraSecreta();// obtiene una palabra aleatoria
    public TiposWordle letraPertenece(String palabraSecreta, char letra, int pos);
    // Retorno si est� dentro la letra y si est� en la posici�n

    public TiposWordle[] getAciertos(String palabraSecreta, String palabra);
    // Retorno todos los aciertos de la palabra introducido

    public boolean acertado( TiposWordle[] aciertos);
    // Retorna true cuando todas letras est�n a ESTA_DENTRO

    public void printlnColores(String palabra,TiposWordle[] aciertos);
}
