import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> pilhaDePares = new Stack<>();
        Stack<Integer> pilhaDeImpares = new Stack<>();

        int i;
        do {
            System.out.println("Digite um número entre -127 e 128 ou 0 para parar");
            i = scan.nextInt();


            if (i % 2 == 0){
                if (i != 0){
                    System.out.println("é par");
                    pilhaDePares.push(i);
                }

            } else{
                System.out.println("é ímpar");
                pilhaDeImpares.push(i);
            }

        } while (i != 0);

        while (!pilhaDeImpares.isEmpty() && !pilhaDePares.isEmpty()){
            System.out.println("retirando ímpar: " + pilhaDeImpares.pop());
            System.out.println("retirando par: " + pilhaDePares.pop());
        }

        if (!pilhaDeImpares.isEmpty()){
            System.out.println("A pilha de ímpares ainda possui " + pilhaDeImpares.size() + " números");
        } else if (!pilhaDePares.isEmpty()){
            System.out.println("A pilha de pares ainda possui " + pilhaDePares.size() + " números");
        } else {
            System.out.println("As duas pilhas estão vazias");
        }
        scan.close();

    }


}
