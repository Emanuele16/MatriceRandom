package matriceRandom;
import java.util.*;

public class Risolvi {
	private static MatriceRandom matriceRandom;
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		matriceRandom = new MatriceRandom();
		System.out.println("Matrice Random");
		execute();
		scan.nextLine();

	}
	
	private static void execute() {
		modificaSomma();
		ottieniSomma();
		setScelta();
	}
	
	private static void modificaSomma() {
		matriceRandom.setSomma();

		
	}
	
	private static void setOut(String path) {
		matriceRandom.salva(path);

	}

	private static void ottieniSomma() {
		matriceRandom.getSomma();

	}
	
	private static void setScelta() {
		int a=0;
		while(a<5) {
			
			System.out.print(System.lineSeparator());
			System.out.println("premi 1 per muovere a destra");
			System.out.println("premi 2 per muovere a sinistra");
			System.out.println("premi 3 per muovere verso l'alto");
			System.out.println("premi 4 per muovere verso il basso");
			System.out.println("premi 5 per Salvare in un file txt l'ultima matrice generata e per terminare il programma");
			System.out.println("premi 6 per uscire senza salvare");


			a=scan.nextInt();
			
			switch (a) {
			
			case 1:
				matriceRandom.setMovRight();
				matriceRandom.getSomma();
				System.out.print(System.lineSeparator());
				
			break;
			
			case 2:
				matriceRandom.setMovLeft();
				matriceRandom.getSomma();
				System.out.print(System.lineSeparator());
				
			break;
			
			case 3:
				matriceRandom.setMovUp();
				matriceRandom.getSomma();
				System.out.print(System.lineSeparator());
				
			break;
			
			case 4:
				matriceRandom.setMovDown();
				matriceRandom.getSomma();
				System.out.print(System.lineSeparator());

			break;
			
			case 5:
				System.out.println("Inserisci il percorso dove vuoi salvare il file txt");
				scan.nextLine();
				String path= scan.nextLine();
				setOut(path);
				System.out.println("Fine, hai salvato");
				
				
			break;
			
			case 6:
				System.out.println("Fine, non hai salvato");
				scan.nextLine();
				
			break;
			
			}
			
		}
		
	}
	
}
