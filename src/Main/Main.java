package Main;

import Utils.Matriz;

public class Main {

    public static void main(String[] args) {

        Matriz matrizA = new Matriz(3, 2);
        Matriz matrizB = new Matriz(2, 3);

//        Matriz.sumMatriz(matrizA, matrizB);
        Matriz.multiplyMatriz(matrizA, matrizB);

    }


}
