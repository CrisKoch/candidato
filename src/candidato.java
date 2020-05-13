import java.util.Locale;
import java.util.Scanner;

public class candidato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int esc, exp;
		char viag, hab;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		
		esc = sc.nextInt();
		
		System.out.println();
		System.out.println("Você tem quantos anos de experiência profissional?");
		exp = sc.nextInt();
		System.out.println("Você tem disponibilidade para viajar (S/N)?");
		viag = sc.next().charAt(0);
		System.out.println("Você tem habilitação de motorista (S/N)?");
		hab = sc.next().charAt(0);
		
		
		
		
		
		
		sc.close();
	}

}
