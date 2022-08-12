package exercicios;

/*
* Main 2
* Executa o código da Main e tem exemplos de uso de método static
* */

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa);

//        ArrayList<String> listaStrings = new ArrayList<>();
//        for(String string: listaStrings){
//            System.out.println(string);
//        }

        pessoa.setLocalOrigem("rua da pipoca");

        String ruaPessoa = pessoa.getLocalOrigem();

        pessoa.printPessoa();

        Pessoa pessoaClonada = pessoa.clonePessoa();

        pessoaClonada.printPessoa();

        pessoaClonada = pessoa;
        pessoa.setLocalOrigem("Local 2");

        pessoaClonada.printPessoa();


    }
}
