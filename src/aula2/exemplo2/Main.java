package aula2.exemplo2;

import aula2.exemplo1.Pessoa; // necessário para acessar classes que estão em pacotes/pastes diferentes

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaAndre = new Pessoa(); //podemos acessar o objeto criado com pessoa pois ele é public
        pessoaAndre.idade = 22;
        pessoaAndre.nome = "André";
        pessoaAndre.envelhecer();

        // PessoaPrivate, modificador private
        // não tem acesso a nenhum método ou atributo da classe
        PessoaPrivate pessoaPrivate = new PessoaPrivate();

        // PessoaDefult, não tem modificador
        // pode ser acessado por todas as classes que estão no mesmo pacote que ele
        PessoaDefault pessoaDefault = new PessoaDefault();
        pessoaDefault.nome = "Default";
        pessoaDefault.idade = 12;
        pessoaDefault.aniversario();
        
        // PessoaProtect, modificador Protected
        // pode ser acessado pelas classe que estão no mesmo pacote ou que herdem dele
        PessoaProtected pessoaProtected = new PessoaProtected();
        pessoaProtected.idade = 31;
        pessoaProtected.nome = "Protected";
        pessoaProtected.envelhecer();
        
        //PessoaPublic, modificador Public
        //Pode ser acessado por todas as classes do projeto
        PessoaPublic pessoaPublic = new PessoaPublic();
        pessoaPublic.idade = 41;
        pessoaPublic.nome = "Public";
        pessoaPublic.envelhecer();
    }
}
