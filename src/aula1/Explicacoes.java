package aula1;

public class Explicacoes {
    public static void main(String[] args) {
        int valor = 0;
        while (valor < 10){
            System.out.println("passou o valor: "+ valor);

            if(valor == 1){
                valor++;
//                return; // para a execução o programa e volta um nível
                continue; // para a execução do loop e volta para o inicio dele
//                break;  // para a execução de um loop e vai para depois do loop
            }
            else {
                valor++;
            }

        }
    }
}
