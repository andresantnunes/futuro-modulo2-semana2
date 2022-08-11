package aula2.exemplo3;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Nome",100);
        System.out.println(pessoa.retornaNome());
        System.out.println(pessoa.retornaIdade());

        pessoa.adicionaCpf("12314123123");
        // apenas posso adicionar um cpf ao objeto pessoa
        // não é possível recuperar o cpf fora da classe pessoa
        // o main não tem como saber o valor de cpf

        pessoa.printPessoa();


        throw new Exception();

    }
}
