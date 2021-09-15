import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;

public class cinema {

	public static void main(String[] args) {
		int nascimento;
		double ingresso = 30;

		Calendar calendario = Calendar.getInstance(TimeZone.getDefault());
		int ano = calendario.get(Calendar.YEAR);

		Scanner ler = new Scanner(System.in);

		System.out.println("Bem vindo ao Programa Cinema");
		System.out.println("Digite seu ano de nascimento:");
		nascimento = ler.nextInt();

		if ((ano - nascimento) < 16) {
			System.out.println("Você recebeu 50% de desconto\nO valor do seu ingresso é: " + (ingresso * 0.5));

		} else if ((ano - nascimento) >= 16 && ((ano - nascimento) < 21)) {
			System.out.println("Você recebeu 20% de desconto\nO valor do seu ingresso é: " + (ingresso * 0.8));

		} else {
			System.out.println("Você não ganhou desconto\nO valor do seu ingresso é: " + ingresso);
		}

	}

}
