package aula2.exemplo3;

public class Pessoa {
    private String nome;   // apenas acessíveis dentro da classe
    private Integer idade; // apenas acessíveis dentro da classe
    private String cpf;

    public Pessoa(){

    }

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, Integer idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public Pessoa(Integer idade, String cpf){
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(String cpf){
        this.cpf = cpf;
    }


    public String retornaNome(){
        return nome;
    }
    public Integer retornaIdade(){
        return idade;
    }

    public void adicionaCpf(String cpf){
        this.cpf = cpf;
    }

    public void printPessoa(){
        System.out.println(
                "Nome: "+this.nome
                + ", Idade:"+this.idade
                + ", CPF:" + this.cpf
        );
    }
}
