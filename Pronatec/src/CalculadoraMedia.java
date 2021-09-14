import java.util.Scanner;

class CalculadoraMedia {
    public static void main(String[] args) {

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] nota3 = new double[10];
        double media;
        String[] nome = new String[10];

        System.out.println("Bem Vindo ao programa Boletim Java");

        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Digite o nome do aluno:");
            nome[i] = ler.next();
            System.out.println("Digite a nota 01 do aluno:");
            nota1[i] = ler.nextDouble();
            System.out.println("Digite a nota 02 do aluno:");
            nota2[i] = ler.nextDouble();
            System.out.println("Digite a nota 03 do aluno:");
            nota3[i] = ler.nextDouble();
        }

        for (int i = 0; i < nota1.length; i++) {
            media = (nota1[i] + nota2[i] + nota3[i]) / 3;
            System.out.println("A média do aluno(a):" + nome[i] + " é " + media);
        }

    }
}