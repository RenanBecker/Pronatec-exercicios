import java.util.Scanner;
import java.lang.Math;


class Main {
  public static void main(String[] args) {
    double nota01, nota02, nota03, media;
    String aluno;
    Scanner ler = new Scanner(System.in);
    System.out.println("Bem vindo a calculadora de média");
    System.out.println("Digite o nome do aluno");
    aluno = ler.next();
    System.out.println("Digite a nota 01");
    nota01 = ler.nextDouble();
    System.out.println("Digite a nota 02");
    nota02 = ler.nextDouble();
    System.out.println("Digite a nota 03");
    nota03 = ler.nextDouble();
    media = (nota01+nota02+nota03)/3;
    double arredondado = (double) (Math.round(media*10.0)/10.0);
    System.out.println("A média final do aluno " + aluno + " é: " + arredondado);
   

  }
}