import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cria um objeto de Calculadora na memória
        //o objeto tem o nome calculadora
        Calculadora calculadora = new Calculadora();
        calculadora.printCalculadora(); // chamada do método printCalculadora
        // numero1 == 10, então ele não vai printar, pois o program faz um return antes


        Calculadora calculadora1 = new Calculadora();
        calculadora1.numero1 = 11.0;
        calculadora1.numero2 = 210.11;
        System.out.println("calculadora1");
        calculadora1.printCalculadora();

        //sempre que chamamos um método com parametros, temos preencher os parametros
        //21.12 e 313.31 são os respectivos numero1 e numero2 dos parametros
        //parametros são posicionais, se inverter os valores eles invertem no método também
        calculadora1.soma(21.12,313.31);


        Calculadora calculadora2 = new Calculadora();
        calculadora2.numero1 = 12.0;
        calculadora2.numero2 = 220.11;
        System.out.println("calculadora2");
//        calculadora2.printCalculadora();

        System.out.println("Soma calculadora2: "+calculadora2.soma(21.0, 123.31));

        System.out.println(calculadora2.toString());

        Calculadora calculadora3 = new Calculadora();
        calculadora3.numero1 = 13.0;
        calculadora3.numero2 = 230.11;
        System.out.println("calculadora3");
        calculadora3.printCalculadora();


        Calculadora calculadora4 = new Calculadora();
        calculadora4.numero1 = 14.0;
        calculadora4.numero2 = 240.11;
        System.out.println("calculadora4");
        calculadora4.printCalculadora();


        // a referência da calculadora 1 passa a ser a referência da calculadora2
        calculadora2 = calculadora1;

        calculadora1.numero1 = 123141.1231;
        System.out.println();
        System.out.println("calculadora2");
        System.out.println(calculadora2.numero1); // é o mesmo numero da calculadora2
        System.out.println(calculadora2.numero2);
        calculadora2.printCalculadora();


        String valor = calculadora.toString(); // return de string, o valor retornado age como uma variável
        System.out.println(calculadora.toString());

    }
}
