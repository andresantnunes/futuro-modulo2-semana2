package aula4.staticJava;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListaLocalPessoas listaLocalPessoas = new ListaLocalPessoas();

//        listaLocalPessoas. não conseguimos acessar métodos static a partir de um objeto
//        Temos que utilizar a classe diretamente

        ListaLocalPessoas.adicionarPessoa(new Pessoa("Nome",10)); // adicionando um objeto diretamente ao parametro do método
        ListaLocalPessoas.adicionarPessoa(new Pessoa("Nomee",11));
        ListaLocalPessoas.adicionarPessoa(new Pessoa("Nomeee",12));

        for(Pessoa pessoa: ListaLocalPessoas.getListaPessoa()){
            System.out.println(pessoa);
        }

        Pessoa pessoa = new Pessoa("Nomee",11);
        Pessoa pessoa1 = new Pessoa("Nomee",11);
        Pessoa pessoa2 = new Pessoa("Nomee",11);

        System.out.println("O numero de pessoas criadas é: " + pessoa.getNumeroPessoas());
    }
}
