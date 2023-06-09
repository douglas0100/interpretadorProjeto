package Execucao;

public class Variavel {

    public String tipo;

    public String nome;

    public String valor;
    
    public Variavel(String tipo, String nome, String valor){

        this.tipo = tipo;
        this.nome = nome;
        this.valor = valor;
        
    }

    @Override
    public String toString(){
        return String.format("[tipo: %s | nome: %s | valor: %s]", this.tipo, this.nome, this.valor);
    }

}
