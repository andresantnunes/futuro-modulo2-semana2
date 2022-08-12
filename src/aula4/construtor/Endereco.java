package aula4.construtor;

public class Endereco {
    private String logradouro;
    private String cep;

    public Endereco(String logradouro, String cep) {
        this.logradouro = logradouro;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
