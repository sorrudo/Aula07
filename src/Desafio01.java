import java.util.Scanner;

public class Desafio01 {
    /*É muito comum que programas que realizam cadastros de pessoas precisem
    validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e verifique
se esse estado existe ou não. Caso exista, a função deve retornar um boolean true.
 Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a
 exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.
     * */

    public static boolean exiteEstado(String estado) {
        if(estado.length() != 2){
            return false;
        }
        String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF",
                "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE",
                "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"
        };
        for (int i = 0; i < estados.length; i++) {
            if (estados[i].equalsIgnoreCase(estado)) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String sigla;
        System.out.println("Digite a sigla de se estado:");
        sigla = leitor.next();
        if(exiteEstado(sigla)  ) {
            System.out.println("O seu estado exite");
        }else {
            System.out.println("A sigla digitada nao existe sigla nao existe");
        }
        leitor.close();
    }
}