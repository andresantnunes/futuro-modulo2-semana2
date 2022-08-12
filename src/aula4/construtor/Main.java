package aula4.construtor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // sempre tem um construtor
        // no caso acima estamos utilizando o construtor vazio/Default da classe Pessoa

        Pessoa pessoa1 = new Pessoa("Sophiye");
        Pessoa pessoa2 = new Pessoa(22);
        Pessoa pessoa3 = new Pessoa("Gabriel", 22);


        Endereco endereco = new Endereco("Euclides da Cunha 777", "10239197");
        pessoa.adicionaEnderecoNovo(
                endereco
        );

        pessoa.adicionaEnderecoNovo(
                new Endereco("Euclides da Cunha 777", "10239197")
        );

        pessoa.adicionaEnderecoNovo(
                new Endereco("Euclides da Cunha 777", "10239197")
        );


        Integer idadePesso = pessoa.getIdade(); // idadePessoa passa a ter o valor da idade do objeto pessoa

        ArrayList<Endereco> enderecosPessoa = pessoa.getEnderecos(); // atribuindo a lista de endereços que esta dentro de pessoa a enderecosPessoa
        for(Endereco item : enderecosPessoa){
            System.out.println(item);
        }

    }
}
