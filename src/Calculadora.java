import java.sql.PreparedStatement;

//Classes sempre são CamelCase, com a primeira letra maiuscula
public class Calculadora {
    double numero1 = 10; // os atributos sempre começam com a primeira letra minúscula
    double numero2 = 50; // 50 é valor padrão,
    // quando atribuimos um novo valor a esse atributos o defaul é sobre escrito

    public void printCalculadora(){ //métodos sempre começam com minúscula e são camelCase
        //this referencia ao objeto que criamos com a classe,
        // no caso as informações dos objeto do Calculadora
        // print dos valore internos da classe
        // void não necessita de um return, ou pode ter um return vazio
        if(this.numero1 == 10.0){
            return; //toda execução de um método acaba em um return
        }
        System.out.println("Numero1: "+ this.numero1 +", Numero2: "+ this.numero2);
        //return implicito, porque é um método void
    }

    // Esse método recebe 2 numeros,
    // soma eles entre si e aos numero do objeto e retorna o resultado
    public double soma(double numero1, double numero2){ // os parametros são obrigatórios na chamada do método
        double resultado = numero1 + numero2 + this.numero1 + this.numero2;

        if(numero1 == 10.0){
            resultado += 20;
        }
        else {
            resultado -= 20;
        }

        return resultado; // o programa vai parar de executar aqui


        // o return tem que ser de um valor do tipo double,
        // pois o método é double
    }

    @Override // sobreescreve um método já existente no Java
    public String toString(){
        return "Numero1: "+ this.numero1 +", Numero2: "+ this.numero2;
    }

}
