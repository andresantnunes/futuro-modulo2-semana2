package aula2.exemplo2;

import aula2.exemplo1.Pessoa; // necessário para acessar classes que estão em pacotes/pastes diferentes

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaAndre = new Pessoa(); //podemos acessar o objeto criado com pessoa pois ele é public
        pessoaAndre.idade = 22;
        pessoaAndre.nome = "André";
        pessoaAndre.envelhecer();
    }
}
