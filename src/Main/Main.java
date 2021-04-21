package Main;

import Cerebro.RedeNeural;
import Utils.Matriz;

public class Main {

    public static void main(String[] args) {
        //1x3
        float[][] entrada = {{0.6f, 0.9f, 0.8f}};
        //3x1
        float[][] peso = {{0.1f}, {0.2f}, {0.3f}};

        float[][] bias = {{0.1f}};

        int valorDesejado = -1;

        float novoPeso;


        Matriz entrada1 = new Matriz(entrada);
        Matriz peso1 = new Matriz(peso);
        Matriz bias1 = new Matriz(bias);

        //3x1 * 1X3 = 1X1
        float[][] resultado = Matriz.multiplyMatriz(entrada1, peso1);

        Matriz resultadoEntradasPesos = new Matriz(resultado);

        float[][] resultado2 = Matriz.sumMatriz(resultadoEntradasPesos, bias1);

        int resultadoDegrau = RedeNeural.funcaoDegral(resultado2[0][0]);

        if (resultadoDegrau == valorDesejado) {
            System.out.println("Sucesso!");
            Matriz.printMatriz2(peso);
        } else {
            System.out.println("Precisa de ajuste");
            Matriz.printMatriz2(peso);
            RedeNeural.recauculoPesos(entrada, peso1, valorDesejado, resultadoDegrau);
        }

    }

}
