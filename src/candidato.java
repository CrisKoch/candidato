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
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		
		esc = sc.nextInt();
		
		System.out.println();
		System.out.println("Voc� tem quantos anos de experi�ncia profissional?");
		exp = sc.nextInt();
		System.out.println("Voc� tem disponibilidade para viajar (S/N)?");
		viag = sc.next().charAt(0);
		System.out.println("Voc� tem habilita��o de motorista (S/N)?");
		hab = sc.next().charAt(0);
		
		// C�lculos
		if (esc == 1) {
			esc = 10;
			}
			else if (esc == 2) {
			esc = 20;
			}
			else if (esc == 3) {
			esc = 30;
			}
			else {
			esc = 40;
			}
		
		if (exp == 0) {
			exp = 0;
		}
			else if(exp <= 2) {
				exp = 10;
			}
			else if( exp > 2 && exp <=5 ) {
				exp = 20;
			}
			else if( exp > 5) {
				exp = 40;
			}
		
		
		System.out.println("Pontos por escolaridade: " + esc);
		System.out.println("Pontos por experi�ncia: " + exp);
		
		
		sc.close();
	}

}
