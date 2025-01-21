package Inmuebles;

public abstract class Inmuebles {

    private String ubicaion;
    private double metrosCuadrados;

    public Inmuebles(String ubicaion, double metrosCuadrados) {
        this.ubicaion = ubicaion;
        this.metrosCuadrados = metrosCuadrados;
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


    public String muestra(){
        return "Inmueble [ " + "Ubicación = "+ ubicaion + "Metros cuadrados = "+ metrosCuadrados + " ]";
    }
}
