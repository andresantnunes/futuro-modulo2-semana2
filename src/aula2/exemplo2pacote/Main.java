package aula2.exemplo2pacote;

import aula2.exemplo2.PessoaPrivate;
import aula2.exemplo2.PessoaProtected;
import aula2.exemplo2.PessoaPublic;

public class Main {
    public static void main(String[] args) {
        // PessoaDefult não pode ser acessada fora do pacote dela

        // PessoaProtected tem a classe Public,
        // porém os métodos e os atributos que são protected não podem ser acessados
        PessoaProtected pessoaProtected = new PessoaProtected();

        // PessoaPrivate tem a classe Public,
        // porém os métodos e os atributos que são private não podem ser acessados
        PessoaPrivate pessoaPrivate = new PessoaPrivate();

        // PessoaPublic tem a classe Public, 
        // além disso tem os métodos e os atributos também como Public
        // pode ser acessado por todas as classe do projeto
        PessoaPublic pessoaPublic = new PessoaPublic();
        pessoaPublic.nome = "Public";
        pessoaPublic.idade = 131;
        pessoaPublic.envelhecer();

    }
}
