package aula4.staticJava;

public class Main2 {
    public static void main(String[] args) {
        Main main = new Main();
        main.main();

        ListaLocalPessoas.deletarListaPessoas();

        ListaLocalPessoas.adicionarPessoa(new Pessoa("",0));

        for(Pessoa pessoa: ListaLocalPessoas.getListaPessoa()){
            System.out.println(pessoa);
        }

        ListaLocalPessoas.printNumeroPessoas();

    }
}
