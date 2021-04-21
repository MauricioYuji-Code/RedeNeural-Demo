package Main;

import Cerebro.RedeNeural;
import Utils.Matriz;

public class Main {

    public static void main(String[] args) {

//        float [][] entrada = {{(float)0.1}, {(float)0.4}, {(float)0,4}};
//
//        Matriz input = new Matriz(2,1);
//
//        RedeNeural redeNeural = new RedeNeural(3,5,1, input);

        float [][] teste = {{1,2}, {2,2}};
        float [][] teste1 = {{3,2}, {4,2}};

        Matriz mt1 = new Matriz(teste);
        Matriz mt2 = new Matriz(teste1);

        Matriz.sumMatriz(mt1, mt2);
        Matriz.multiplyMatriz(mt1, mt2);

    }

}
