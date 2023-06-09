package Execucao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Execucao {

    public Map<Integer, String> variaveisInteiras;
    public Map<Double, String> variaveisDouble;
    
    public Execucao(){
        variaveisInteiras = new HashMap<>();
        variaveisDouble = new HashMap<>();
    }

    public boolean adicionaVariavel(Variavel variavel){
        
        switch(variavel.tipo){

            case "int":
                int valorInteiro = Integer.parseInt(variavel.valor);
                variaveisInteiras.put(valorInteiro, variavel.nome);
                break;

            case "double":
                Double valorDouble = Double.parseDouble(variavel.valor);
                variaveisDouble.put(valorDouble, variavel.nome);
                break;
        }

        return true;

    }


    public void calcula(List<Variavel> variaveis, List<String> simbolos) {

        



    }



}
