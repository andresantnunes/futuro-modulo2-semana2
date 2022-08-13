package exercicios;

public class Pessoa {
    //Atributos
    private String nome;
    private Integer idade;
    private String localOrigem;

    // Construtores
    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.localOrigem = "Brasil";
    }

    public Pessoa(String nome, Integer idade, String localOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.localOrigem = localOrigem;
    }

    // Métodos
//    public void adicionaDadosPessoa(String nome, Integer idade ){
//        this.nome = nome;
//        this.idade = idade;
//    }

    public void envelhecer(){
        this.idade++;
    }
//    public Integer envelhecer(){
//        return this.idade++;
//    }

    public void printPessoa(){
        System.out.println("Nome:"+nome+", Idade:"+idade+", Local de Origem:"+localOrigem);
    }

    public Pessoa clonePessoa(){
        return new Pessoa(this.nome, this.idade, this.localOrigem);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }
}
