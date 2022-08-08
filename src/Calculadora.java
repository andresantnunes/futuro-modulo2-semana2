//Classes sempre são CamelCase, com a primeira letra maiuscula
public class Calculadora {
    double numero1 = 10; // os atributos sempre começam com a primeira letra minúscula
    double numero2 = 50; // 50 é valor padrão,
    // quando atribuimos um novo valor a esse atributos o defaul é sobre escrito

    public void printCalculadora(){
        //this referencia ao objeto que criamos com a classe,
        // no caso as informações dos objeto do Calculadora
        // print dos valore internos da classe
        System.out.println("Numero1: "+ this.numero1 +", Numero2: "+ this.numero2);
    }
}
