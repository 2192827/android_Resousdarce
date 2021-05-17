package com.example.android_resource;

import java.util.ArrayList;
import java.util.List;

public class DadosApp {

    private List<PassoReceita> receita;
    private int posicao;
    private int total_passos;

    // singleton
    public DadosApp() {
        receita = new ArrayList<>();
        receita.add(new PassoReceita("1. Passo --> Preparação de ingredientes:\n" +
                "        1) 2 colheres de açúcar;\n" +
                "        2) 3 colheres de farinha de trigo;\n" +
                "        3) 4 colheres de margarina;\n" +
                "        4) 3 ovos;\n" +
                "        5) 3 colheres de leite;\n" +
                "        6) 1 colher bem cheia de fermento em pó", ""));
        receita.add(new PassoReceita("2. Passo --> Mistura de ingredientes:\n" +
                "1) Bata as claras em neve e reserve;\n" +
                "2) Misture as gemas, a margarina e" +
                " o açúcar até obter uma massa homogênea;\n" +
                "3) Acrescente o leite e a farinha de trigo aos poucos, " +
                "sem parar de bater;\n" +
                "4) Adicione as claras em neve e o fermento.", ""));
        receita.add(new PassoReceita("3. Passo --> Colocar o bolo na forma:\n" +
                "                \"1) Despeje a massa em uma forma.", ""));
        receita.add(new PassoReceita("4. Passo --> Coloque o bolo no forno:\n" +
                "1) Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos, de forma que ao furar o bolo com um garfo, este saia limpo", ""));
        receita.add(new PassoReceita("5. Passo --> Finalizar o bolo:\n" +
                "1) Retire o bolo do forno;\n" +
                "2) Coloque o bolo num prato;\n" +
                "3) Corte o bolo e prove-o", ""));

        posicao = 1;
        total_passos = receita.size();
    }

    public String getTextoPassoReceita() {
        return receita.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < total_passos)
            posicao++;
    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        receita.get(posicao - 1).setFeito(true);
    }
}
