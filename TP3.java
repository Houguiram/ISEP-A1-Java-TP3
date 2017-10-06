import java.util.Scanner;

public class TP3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Que souhaitez-vous faire ?");
		System.out.println("1. Prompt et Print de tableaux");
		System.out.println("2. Moyenne de tableaux");
		int choix = scan.nextInt();
		switch (choix) {
		case 1:
			exo1();
			break;
		case 2:
			moyennes();
			break;
		default:
			System.out.println("Veuillez entrer un choix valide.");
		}

	}

	public static void exo1() {
		System.out.println("Tableau uni-dimenssionnel à 4 valeurs :");
		int[] array = promptIntArray();

		printIntArray(array);

		System.out.println("Tableau à 3 lignes et 4 colonnes :");
		int[][] bigArray = new int[3][4];
		for (int i = 0; i < bigArray.length; i++) {
			System.out.println("Ligne d'indice " + i + " :");
			bigArray[i] = promptIntArray();
		}
		for (int i = 0; i < bigArray.length; i++) {
			printIntArray(bigArray[i]);
		}

	}

	public static int[] promptIntArray() {
		int[] array = new int[4];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Nombre d'indice " + i + " ?");
			array[i] = scan.nextInt();
		}
		return array;
	}

	public static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
