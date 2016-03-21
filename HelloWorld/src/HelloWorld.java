import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	/*	System.out.println("Hello world");
		System.out.println("1 - Opçoes");
		System.out.println("2 - Sair");
		int option = scan.nextInt();*/
		
		int maxNomes = 5;
		int i = 0;
		ArrayList<String> nomes = new ArrayList<>();
		
		while (i < maxNomes  ) {
			System.out.println("Digite 5 nomes de pessoas");
			nomes.add(scan.nextLine());
			i++;
		}

		
		for (int j = 0; j < nomes.size(); j++) {
			System.out.println("Nome " + j + " " + nomes.get(j).toString() );
			
		}
		
	/*	switch (option) {
		case 1:
			System.out.println("Opção 1");
			break;
		case 2:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Nenhuma");
			break;
		}*/
		
	}

}
