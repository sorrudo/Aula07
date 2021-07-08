public class funcoesMatematica {
    public static void somar(double valor1, double valor2) {
        double soma;
        System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
        soma = valor1 + valor2;
        System.out.println("O resultado foi " + soma + "!\n\n");
    }
    public static void subtrair(double valor1, double valor2) {
        double subtracao;
        System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
        subtracao = valor1 - valor2;
        System.out.println("O resultado foi " + subtracao + "!\n\n");
    }
    public static void dividir(double valor1, double valor2) {
        double divisao;
        System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
        divisao = valor1 / valor2;
        System.out.println("O resultado foi " + divisao + "!\n\n");
    }
    public static void multiplicar(double valor1, double valor2) {
        double multiplicacao;
        System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
        multiplicacao = valor1 * valor2;
        System.out.println("O resultado foi " + multiplicacao + "!\n\n");
    }

}
