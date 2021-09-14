import java.util.Scanner;
import java.lang.Math;


class Semana0302 {
  public static void main(String[] args) {
    double altura, largura, metade, caibro;
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Bem vindo a calculadora de caibro");
    System.out.println("Digite a largura da casa:");
    largura = ler.nextDouble();
    while (largura <= 0){
      System.out.println("Tamanho invalido\nFavor digitar uma largura maior que 0");
      largura = ler.nextDouble();
    }
    System.out.println("Digite a altura do telhado:"); 
    altura = ler.nextDouble();
    while (altura <= 0){
      System.out.println("Tamanho invalido\nFavor digitar uma altura maior que 0");
      altura = ler.nextDouble();
    }
    metade = largura/2;
    caibro = Math.sqrt(altura * altura + metade * metade);
    caibro = (Math.round(caibro*100.0)/100.0);
    System.out.println("O Tamanho do caibro é: " + caibro);
  }
}
