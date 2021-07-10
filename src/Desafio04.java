import java.util.Scanner;

public class Desafio04 {
    /*
    Considere o cálculo do salário de um professor, disponível em
     http://www1.sinprosp.org.br/guia_consultas.asp?mat=8

    Crie as funções que julgar necessárias para obter cada um dos valores
     que fazem parte do salário de um professor
     * */
    public static double salarioAulista(double aulaSemana, double horaAula) {
        double aulasMensais;
        double valorSalario;
        aulasMensais = aulaSemana * 4.5;
        valorSalario = aulasMensais * horaAula;
        return valorSalario;
    }



    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        byte opcao;
        byte aulaSemana;
        double horaAula;
        byte horaAtividade;
        double adicional;
        double salarioTotal;

        System.out.println("Vamos descobrir qual o seu Salário com base do SIMPRO SP\n");
        System.out.println("Escolha a opção..");
        System.out.println("Você é aulista ou mensalista \n(1) Aulista  (2) Mensalista");
        opcao = leitor.nextByte();
        switch (opcao){
            case 1:
                System.out.println("Quantas aula por semana:");
                aulaSemana = leitor.nextByte();
                System.out.println("Qual o valor da Hora Aula:");
                horaAula = leitor.nextDouble();
                System.out.println("O valor do seu salário base é:\n " + salarioAulista(aulaSemana, horaAula));
                System.out.println("Deseja acrescentar o adicional de hora-atividade ?\n (1) SIM  (2) NÃO ");
                horaAtividade = leitor.nextByte();
                if (horaAtividade == 1){
                    adicional = salarioAulista(aulaSemana, horaAula) * 0.05;
                    salarioTotal = adicional + salarioAulista(aulaSemana, horaAula);
                    System.out.println(" com adicional o valor do seu sálario fica: " + salarioTotal);
                }else {
                    System.out.println("Encerrando programa....");
                }


            case 2:
                System.out.println("Digite seu Salário:");
                salario = leitor.nextDouble();
                System.out.println("Deseja acrescentar o adicional de hora-atividade ?\n (1) SIM  (2) NÃO ");
                horaAtividade = leitor.nextByte();
                if (horaAtividade == 1) {
                    adicional = salario * 0.05;
                    salarioTotal = salario + adicional;
                    System.out.println(" com adicional o valor do seu sálario fica: " + salarioTotal);
                }else {
                    System.out.println("Encerrando programa.....");
                }
        }







    }
}
