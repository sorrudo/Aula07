import java.util.Scanner;

public class Desafio03 {
    /*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele.
     * */
    public static String calcTriangulo(double valor1, double valor2, double valor3) {
        if(valor1 + valor2 > valor3) {
            if (valor2 + valor3 > valor1){
                if (valor3 + valor1 > valor2){
                    return "O seu triangulo existe";
                }
            }
        }
        return "O seu triangulo não existe";
    }
    public static String verificaTipoTriangulo(double valor1, double valor2, double valor3) {
        if(valor1 == valor2 || valor1 == valor3){
            return "Esse triângulo é Isósceles";
        }else if (valor1 != valor2 && valor1 != valor3) {
            return "Esse triângulo é Escaleno";
        }else if(valor1 == valor2 && valor1 == valor3) {
            return "Esse triânguo é Equilátero";
        }
        return null;
    }

    public static void main(String[] args) {
        double valor1;
        double valor2;
        double valor3;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os valores do 1° triangulo");
        valor1 = leitor.nextDouble();
        System.out.println("Digite os valores do 2° triangulo");
        valor2 = leitor.nextDouble();
        System.out.println("Digite os valores do 3° triangulo");
        valor3 = leitor.nextDouble();
        System.out.println(calcTriangulo(valor1, valor2, valor3));
        System.out.println("\n\n");
        System.out.println(verificaTipoTriangulo(valor1, valor2, valor3));
        leitor.close();
    }
}