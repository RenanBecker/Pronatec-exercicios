import java.util.Scanner;

public class Semana043 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int valor, aux, numero;

		valor = 0;
		aux = 0;

		System.out.println("Digite o ultimo número da PA");
		numero = ler.nextInt();

		for (int i = 0; i <= numero; i++) {
			valor += aux;
			aux++;
		}
		System.out.println(valor);
	}

}
