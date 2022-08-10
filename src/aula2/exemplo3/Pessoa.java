package aula2.exemplo3;

public class Pessoa {
    private String nome;   // apenas acessíveis dentro da classe
    private Integer idade; // apenas acessíveis dentro da classe
    private String cpf;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
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
