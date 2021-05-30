package com.example.android_resource;

import java.util.ArrayList;
import java.util.List;




public class DadosApp {

    private List<PassoReceita> listaPassos;
    private int posicao;


    // singleton
    public DadosApp() {

        listaPassos = new ArrayList<>();

        listaPassos.add(new PassoReceita("1. Passo --> Preparação de ingredientes"));
        listaPassos.add(new PassoReceita("2. Passo --> Mistura de ingredientes"));
        listaPassos.add(new PassoReceita("4. Passo --> Coloque o bolo no forno"));
        listaPassos.add(new PassoReceita("5. Passo --> Finalizar o bolo"));
            posicao = 1;



    }


    public String getTextoPassoReceita() {

        return listaPassos.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaPassos.size())
            posicao++;

    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        listaPassos.get(posicao - 1).setFeito(true);
    }


}
