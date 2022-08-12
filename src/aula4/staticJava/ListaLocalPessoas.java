package aula4.staticJava;

import java.util.ArrayList;

public class ListaLocalPessoas {
    // atributos static existem apenas para a classe
    // não temos um atributo para cada objeto
    private static ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    // o método static é chamado apenas pela classe
    // o método static não existe para objetos do tipo ListaLocalPessoas
    public static void adicionarPessoa(Pessoa pessoaNova){
        listaPessoa.add(pessoaNova);
    }

    public static ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public static void printNumeroPessoas(){
        System.out.println("O numero de pessoas criadas é: " + Pessoa.getNumeroPessoas());
    }

    public static void deletarListaPessoas(){
        Pessoa.zerarPessoas();
        listaPessoa.clear();
    }

}
