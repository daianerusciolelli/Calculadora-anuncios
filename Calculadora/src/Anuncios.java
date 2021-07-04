import java.util.Scanner;

public class Anuncios {

	public static void main(String[] args) {
		
		int real;
		int valor_anuncio = 30;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor investido no anuncio? ");
		real = sc.nextInt();
		System.out.println("A quantidade de pessoas que visualizam o anuncio é " + real * valor_anuncio + " pessoas");
		
		
		
		
		
		sc.close();
	}

}
