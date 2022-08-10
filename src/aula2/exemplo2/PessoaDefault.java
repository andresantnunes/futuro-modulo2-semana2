package aula2.exemplo2;

// default não tem modificador
// é o modificador quando não definimos um modificador
class PessoaDefault {
    String nome;
    Integer idade;

    Integer envelhecer(){
        return ++idade;
    }

    void printPessoa(){
        System.out.println(
                "Nome: "+ this.nome + ", Idade: "+ this.idade
        );
    }

    void aniversario(){
        System.out.println(
                "Parabêns!!, você está fazendo :" + envelhecer()
        );

    }
}
