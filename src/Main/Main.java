package Main;

import Cerebro.RedeNeural;
import Utils.Matriz;

public class Main {

    public static void main(String[] args) {

//        Matriz matrizA = new Matriz(2, 2);
//        Matriz matrizB = new Matriz(2, 2);
//
//        Matriz.sumMatriz(matrizA, matrizB);
//        Matriz.multiplyMatriz(matrizA, matrizB);

//
//        Neuronio neuronio = new Neuronio();
//        Neuronio neuronio2 = new Neuronio();
//        List<Float>entradas = new ArrayList<>();
//        List<Float>pesos = new ArrayList<>();
//        entradas.add(3F);
//        entradas.add(3F);
//        pesos.add(0.2F);
//        pesos.add(0.02F);
//
//        List<Float>entradas =  Lista.pupoulaLista(10);
//        List<Float>pesos =  Lista.pupoulaLista(10);
//
//        System.out.println("Entrada " +entradas);
//        System.out.println("Pesos " +pesos);
//
//        neuronio.soma(entradas, pesos);

        Matriz input = new Matriz(2,1);
        RedeNeural redeNeural = new RedeNeural(2,2,1, input);

//        float num[] = {1, 2};
//        Matriz.arrayParaMatriz(num, 1);

        float[][] num={ {1}, {2} };
//        Matriz.printMatriz2(num);

    }

}
