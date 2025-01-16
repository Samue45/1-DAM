package Programming.Unit2.Herencia.Ejercicio4.Secciones;

import Programming.Unit2.Herencia.Ejercicio4.Museo;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos.Pintura;

import java.util.ArrayList;

public abstract class CatalogoMuseo extends Museo {

    private ArrayList<Obras> listaObras;

    public CatalogoMuseo(String tematica) {
        this.listaObras = new ArrayList<>();
    }

    public CatalogoMuseo(){}


    public ArrayList<Obras> getListaObras() {
        return listaObras;
    }

    public void setListaObras(ArrayList<Obras> listaObras) {
        this.listaObras = listaObras;
    }

    //Métodos adicionales
    public String sumarObras(Obras nuevaObra){
        // 1º Comprobar si la obra existe
        // 2º True = Mensaje de error, porque ya existe
        // 3º False = Mensaje de éxito
        String mensaje = "";

        for (int i = 0; i < listaObras.size(); i++) {
            if (listaObras.get(i) == nuevaObra ){
                mensaje = "La obra (" + nuevaObra.getTitulo()  + ") ya existe";
            }else {
                listaObras.add(nuevaObra);
                mensaje = "Se ha añadido la obra (" + nuevaObra.getTitulo()  +  ") con éxito";
            }
        }
        return mensaje;
    }

    public String eliminarObra(Obras obra){
        //1º Verificar si la obra existe
        // 2º True = Se elimina y mensaje de éxito
        // 3º False = No se puede eliminar y mensaje de error
        String mensaje = "";

        for (int i = listaObras.size() - 1; i > 0 ; i--) {
            if (listaObras.get(i) == obra ){
                listaObras.remove(i);
                mensaje = "Se ha eliminado la obra (" + obra.getTitulo()  + ") con éxito";
            }else {
                mensaje = "No existe la obra (" + obra.getTitulo()  + ")";
            }

        }
        return mensaje;
    }

    public Obras buscarObra (int nuevoInventario){
        for (int i = 0; i < listaObras.size() ; i++) {
            if (listaObras.get(i).getNumeroInventario() == nuevoInventario){
                return listaObras.get(i);
            }
        }
        return null;
    }

    public int calcularSuperficiePinturas(){
        int sum = 0;
        Pintura pintura;

        for (int i = 0; i < listaObras.size(); i++) {
            //Necesito acceder al método dimensiones de cada pintura del museo
            if(listaObras.get(i) instanceof Pintura){

            }
            
        }
        
        return 0;
    }


}
