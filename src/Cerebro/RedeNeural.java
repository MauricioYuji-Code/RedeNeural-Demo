package Cerebro;

import Utils.Matriz;

public class RedeNeural {

    int n_camada_entrada;
    int n_camda_oculta;
    int n_camada_saida;

    Matriz bias_entrada;
    Matriz bias_oculta;
    Matriz bias_saida;

    Matriz peso_entrada_oculta;
    Matriz peso_oculta_saida;

    public RedeNeural(int n_camada_entrada, int n_camda_oculta, int n_camada_saida, Matriz input){
        this.n_camada_entrada = n_camada_entrada;
        this.n_camda_oculta = n_camda_oculta;
        this.n_camada_saida = n_camada_saida;

//        this.bias_entrada = new Matriz(n_entrada, 1);
//        this.bias_oculta = new Matriz(n_oculta, 1);

//        this.bias_entrada = new Matriz(n_entrada, 1);
//        this.bias_oculta = new Matriz(n_oculta, 1);

        this.peso_entrada_oculta = new Matriz(n_camda_oculta, n_camada_entrada);
//        this.peso_oculta_saida = new Matriz(n_saida, n_oculta);

        feedFoward(input);

    }

    public void feedFoward(Matriz input){

        Matriz.multiplyMatriz(peso_entrada_oculta, input);

    }


}
