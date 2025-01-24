package Inmuebles.HijosInmuebles;

import Inmuebles.Interfaces.Cimientos.Inmuebles;

public abstract class Construccion extends Inmuebles {

    private TiposConstrucciones tiposConstrucciones;


    public Construccion(String ubicaion, double metrosCuadrados, int id, TiposConstrucciones tiposConstrucciones) {
        super(ubicaion, metrosCuadrados, id);
        this.tiposConstrucciones = tiposConstrucciones;
    }

    public TiposConstrucciones getTiposConstrucciones() {
        return tiposConstrucciones;
    }

    public void setTiposConstrucciones(TiposConstrucciones tiposConstrucciones) {
        this.tiposConstrucciones = tiposConstrucciones;
    }

    @Override
    public String muestra(){
        return super.muestra() + "Construcción [" + "Tipo de Construcción = " + tiposConstrucciones + "]";
    }
}
