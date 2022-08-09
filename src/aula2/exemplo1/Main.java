package aula2.exemplo1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); //pessoa1 é o objeto
        // o new sempre gera um novo objeto
        pessoa1.idade = 10;
        pessoa1.nome = "Zé";
        pessoa1.envelhecer();

        System.out.println(pessoa1.idade);
        pessoa1.envelhecer();

        Pessoa pessoa2 = new Pessoa();// pessoa 2 é outro objeto
    }
}
