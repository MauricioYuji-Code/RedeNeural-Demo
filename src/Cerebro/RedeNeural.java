package Cerebro;

import Utils.Matriz;

public class RedeNeural {

    int camada_entrada;
    int n_camda_oculta;
    int camada_saida;

    Matriz bias_entrada;
    Matriz bias_oculta;
    Matriz bias_saida;

    Matriz peso;
    Matriz peso_oculta_saida;

    public RedeNeural(int camada_entrada, int n_camada_oculta, int camada_saida, Matriz input){
        this.camada_entrada = camada_entrada;
        this.n_camda_oculta = n_camada_oculta;
        this.camada_saida = camada_saida;

        this.bias_entrada = new Matriz(camada_entrada, 1);
        bias_entrada.mapMatrizRandomica();
//        this.bias_oculta = new Matriz(n_oculta, 1);

//        this.bias_entrada = new Matriz(n_entrada, 1);
//        this.bias_oculta = new Matriz(n_oculta, 1);

        this.peso = new Matriz(n_camada_oculta, camada_entrada);
//        this.peso_oculta_saida = new Matriz(n_saida, n_oculta);

        feedFoward(input);

    }

    public void feedFoward(Matriz input){

        float[][]resultadoEntradaPeso =  Matriz.multiplyMatriz(peso, input);
        //Todo
//        float[][]resultadoEPBias = Matriz.sumMatriz( ,bias_entrada);



    }


}
