package Programming.Unit2.Herencia.Ejercicio4;

import Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos.Escultura;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos.Pintura;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Obras;

import java.util.ArrayList;

public  class CatalogoMuseo {

    private ArrayList<Obras> listaObras;

    public CatalogoMuseo(ArrayList<Obras> listaObras) {
        this.listaObras = listaObras;
    }

    public CatalogoMuseo() {
    }

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
            if (listaObras.get(i).equals(obra)){
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
        int sumaSuperficie = 0;
        for (Obras obra : listaObras){
            //Necesito acceder al método dimensiones de cada pintura del museo
            if(obra instanceof Pintura pintura){
                sumaSuperficie += pintura.getDimensiones().getAltura() * pintura.getDimensiones().getAnchura() ;
            }
        }
        return sumaSuperficie;
    }

    public int buscarEsculturaMasAlta(){
        int indentificador = 0;

        for (Obras obra : listaObras){
            //Necesito acceder a la altura de cada escultura
            if(obra instanceof Escultura escultura){
                double altura = 0;
                if (escultura.getAltura() > altura){
                    //Se guarda la altura mayor
                    altura = escultura.getAltura();

                    if (escultura.getAltura() == altura){
                        //Guardamos el identificador de la escultura más alta
                        indentificador = escultura.getNumeroInventario();
                    }
                }
            }
        }
        return indentificador;

    }


}
