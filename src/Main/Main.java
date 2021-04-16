package Main;

import Gen.Neuronio;
import Utils.Matriz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Matriz matrizA = new Matriz(2, 2);
//        Matriz matrizB = new Matriz(2, 2);
//
//        Matriz.sumMatriz(matrizA, matrizB);
//        Matriz.multiplyMatriz(matrizA, matrizB);

        Neuronio neuronio = new Neuronio();
        List<Float>entradas = new ArrayList<>();
        List<Float>pesos = new ArrayList<>();
        entradas.add(3F);
        entradas.add(3F);
        pesos.add(3F);
        pesos.add(3F);


        neuronio.soma(entradas, pesos);


    }




}
