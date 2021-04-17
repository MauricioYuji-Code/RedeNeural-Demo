package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {


    public static List pupoulaLista(int tamanho) {
        List<Float>lista = new ArrayList<>();
        Random aleatorio = new Random();
        for (int i = 0 ; i < tamanho ; i++){

//            lista.add((float) (Math.floor(Math.random() * 10)));

            lista.add((float) (aleatorio.nextInt((10 - (-10)) + 1) + (-10)));

        }
//        System.out.println(lista);
       return lista;
    }


}
