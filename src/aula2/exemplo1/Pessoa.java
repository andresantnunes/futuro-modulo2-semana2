package aula2.exemplo1;

public class Pessoa {
    public String nome;
    public Integer idade;

    public Integer envelhecer(){
        return ++idade; // idade = idade + 1
        //retorna a idade quando chamado
    }
}
