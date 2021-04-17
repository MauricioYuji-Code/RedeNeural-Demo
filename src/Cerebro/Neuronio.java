package Cerebro;

import java.util.List;

public class Neuronio {

    private float result;
    private float entrada;
    private float saida;

    public Neuronio() {

    }

    public Neuronio(float entrada) {
        this.entrada = entrada;
    }

    //nivel de ativação
    public void soma(List<Float> entradas, List<Float> pesos) {
        float resultadoSoma = 0;
        for (int i = 0; i < entradas.size(); i++) {
            for (int j = 0; j < pesos.size(); j++) {
                if (i == j) {
                    result = entradas.get(i) * pesos.get(j);
//                    System.out.println("Entrada posicao: " +i+ "Valor: " + entradas.get(i));
//                    System.out.println("Entrada peso: " +j+ "Valor: " + entradas.get(j));
                    System.out.println("Resultado Multiplicação" + "(" + (i + 1) + "): " + result);
                    resultadoSoma += result;
                }
            }
        }
        System.out.println("Resultado da soma " + resultadoSoma);
        ativacao(resultadoSoma);
    }

    public void ativacao(float x) {
        //f (x) = 1 / (1 + e ^ -x)
        double resultadoAtivacao = 1 / (1 + Math.pow(Math.E, -x));
        System.out.println("Sem arrendondar: " + resultadoAtivacao);
        System.out.println("Arredondado: " + Math.round(resultadoAtivacao));
        float n = Math.round(resultadoAtivacao);
        setSaida(n);
    }


    public float getSaida() {
        return saida;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }
}