package aula5;

public class Pessoa {
    String nome;
    private Integer idade;
    private String localOrigem;

    public Pessoa(){
        nome = "";
        idade = 0;
    }
    public Pessoa(String nome, Integer idade, String localOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.localOrigem= localOrigem;
    }


    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public void printPessoa(){
        System.out.println("Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", localOrigem='" + localOrigem + '\'' +
                '}');
    }

    public Pessoa clonePessoa(){
        return new Pessoa(nome, idade, localOrigem);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", localOrigem='" + localOrigem + '\'' +
                '}';
    }
}
