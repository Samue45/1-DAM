package Inmuebles;

public abstract class Inmuebles extends AgenciaInmobiliaria {

    private String ubicaion;
    private double metrosCuadrados;
    private int id;

    public Inmuebles(String ubicaion, double metrosCuadrados, int id) {
        super();
        this.ubicaion = ubicaion;
        this.metrosCuadrados = metrosCuadrados;
        this.id = id;
    }

    public String getUbicaion() {
        return ubicaion;
    }

    public void setUbicaion(String ubicaion) {
        this.ubicaion = ubicaion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String muestra(){
        return "Inmueble [ " + "Ubicación = "+ ubicaion + "Metros cuadrados = "+ metrosCuadrados + " ]";
    }

    //Comprueba si 2 inmuebles son iguales en base al identificador del inmueble
    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if (obj instanceof Inmuebles && ((Inmuebles) obj).id == this.id){
            iguales = true;
        }
        return iguales;
    }
}
