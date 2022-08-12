package aula4.staticJava;

public class Pessoa {
    private String nome;
    private Integer idade;

    private static Integer numeroPessoas = 0; // pertence a classe e não aos objetos

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        numeroPessoas++; // adicionar 1 ao numero de pessoas
        // se o numero é static ele adiciona 1 toda vez que um novo objeto é criado
        // se o numero não é static ele apenas soma 1 vez no objeto
    }

    public static Integer getNumeroPessoas(){
        return numeroPessoas;
    }
    public static void zerarPessoas(){
        numeroPessoas=0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
