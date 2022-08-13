package exercicios;

/*
* Main 2
* Executa o código da Main e tem exemplos de uso de método static
* */

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.adicionaDadosPessoa("nome", 10);
        pessoa.envelhecer();
        pessoa.setIdade(23);
        pessoa.setNome("Mauricio");

        Pessoa pessoa1 = new Pessoa("Nome", 5,"Brasil");
        pessoa1.envelhecer();
        pessoa1.printPessoa();

        Pessoa pessoaClonada = pessoa.clonePessoa();
        pessoaClonada.printPessoa();
    }
}
