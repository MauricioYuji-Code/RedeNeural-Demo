package Gen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Neuronio {

    private float result;

    //nivel de ativação
    public void soma(List<Float> entradas, List<Float> pesos) {
        float resultadoSoma = 0;
        for (int i = 0 ; i<entradas.size() ; i++){
            for (int j = 0 ; j<pesos.size() ; j++){
                if(i == j){
                    result = entradas.get(i) * pesos.get(j);
//                    System.out.println("Entrada posicao: " +i+ "Valor: " + entradas.get(i));
//                    System.out.println("Entrada peso: " +j+ "Valor: " + entradas.get(j));
                    System.out.println("Resultado Multiplicação Neuronio"+"("+(i+1)+"): " + result);
                    resultadoSoma += result;
                }
            }
        }
        System.out.println("Resultado da soma " + resultadoSoma);
    }

    public void ativacao() {

    }

    public Float saida(float n) {
        return n;
    }
}