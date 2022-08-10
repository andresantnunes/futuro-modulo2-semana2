package aula2.exemplo2;

public class PessoaProtected {
    protected String nome;
    protected Integer idade;

    protected Integer envelhecer(){
        return ++idade;
    }
}
