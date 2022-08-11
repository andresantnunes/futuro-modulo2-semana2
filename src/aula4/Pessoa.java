package aula4;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private Integer idade;
    private ArrayList<Endereco> listaEnderecos = new ArrayList<>(); // atributo lista de endereços

    public void adicionaEnderecoNovo(Endereco endereco){
        this.listaEnderecos.add(endereco);
    }

    public ArrayList<Endereco> getEnderecos(){
        return this.listaEnderecos;
    }

    // é um construtor parametrizado
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    // é um construtor Default, padrão de uso
    public Pessoa(){}

    // construto parametrizado com apenas 1 paramentro
    public Pessoa (String nome){
        this.nome = nome;
    }
    public Pessoa (Integer idade){
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
