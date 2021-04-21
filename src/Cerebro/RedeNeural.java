package Cerebro;

import Utils.Matriz;

public class RedeNeural {


    public RedeNeural() {


    }

    public void feedFoward() {


    }

    public static int funcaoDegral(float n) {

        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        }

        return 0;
    }

    public static float[][] recauculoPesos(float[][] entrada, Matriz peso, int valorDesejado, int resultadoDegrau) {

        float taxaAprendizado = 0.1f;
        //taxaAprendizado * (valor desejado - valor degrau) * entrada n [1][3]
        //matriz
        float[][] matrizResultante = new float[peso.getData().length][peso.getData()[0].length];//[3][1]
        System.out.println("Teste taxaAprendizado * (valor desejado - valor degrau) * entrada n");
        for (int i = 0; i < peso.getData().length; i++) {
            for (int j = 0; j < peso.getData()[0].length; j++) {
                matrizResultante[i][j] = (taxaAprendizado * (valorDesejado - resultadoDegrau)) * entrada[j][i];
                System.out.println(matrizResultante[i][j]);
            }
        }

        //DeltaPeso1 = taxaAprendizado * (valor desejado - valor degrau) * entrada n1
        //DeltaPeso2 = taxaAprendizado * (valor desejado - valor degrau) * entrada n2
        //DeltaPeso3 = taxaAprendizado * (valor desejado - valor degrau) * entrada n3

        //[DeltaPeso1, DeltaPeso2, DeltaPeso3]

        Matriz pesoDelta = new Matriz(matrizResultante);

        return Matriz.sumMatriz(peso, pesoDelta);

    }


}
