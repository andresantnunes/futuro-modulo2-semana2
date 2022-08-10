package aula2.exemplo2;

public class PessoaPrivate {
    private String nome;
    private Integer idade;

    private Integer envelhecer(){
        return ++this.idade;
    }

    private void printPessoa(){
        System.out.println(
                "Nome: "+ this.nome + ", Idade: "+ this.idade
        );
    }

    private void aniversario(){
        System.out.println(
                "Parabêns!!, você está fazendo :" + envelhecer()
        );

    }
}

