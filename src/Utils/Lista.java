package Utils;

import java.util.ArrayList;
import java.util.List;

public class Lista {


    public static List pupoulaLista(int tamanho) {
        List<Float>lista = new ArrayList<>();
        for (int i = 0 ; i < tamanho ; i++){
            lista.add((float) (Math.floor(Math.random() * 10)));
        }
//        System.out.println(lista);
       return lista;
    }


}
