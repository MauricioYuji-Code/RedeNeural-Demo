package Cerebro;

import java.util.ArrayList;
import java.util.List;

public class Camada {

    List<Neuronio> neuronios = new ArrayList<>();

    public Camada(List<Neuronio> neuronios) {
        this.neuronios = neuronios;
    }
}
