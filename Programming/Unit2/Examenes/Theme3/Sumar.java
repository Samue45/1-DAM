package Programming.Unit2.Examenes.Theme3;

public class Sumar implements Operacion{
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    int ejecutarOperacion(Operacion operacion, int x, int y){
        return  operacion.sumar(x,y);
    }

    int operar(int ...number){
        int sum = 0;

        for (int numb : number){
            sum += numb;
        }
        return  sum;
    }
}
