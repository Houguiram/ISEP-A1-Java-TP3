import java.util.Scanner;

public class TP3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		exo1();
		scan.close();

	}

	public static void exo1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tableau uni-dimenssionnel à 4 valeurs :");
		int[] array = new int[4];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Nombre d'indice " + i + " ?");
			array[i] = scan.nextInt();
		}

		printIntArray(array);
		
		System.out.println("Tableau à 3 lignes et 4 colonnes :");
		int[][] bigArray = new int[3][4];
		for (int i = 0; i < bigArray.length; i++) {
			for (int t = 0; t < bigArray[i].length; t++){
				System.out.println("Nombre de la ligne " + i + " et de la colonne " + t + " ?");
				bigArray[i][t] = scan.nextInt();
			}
		}
		for (int i = 0; i < bigArray.length; i++) {
			printIntArray(bigArray[i]);
		}
		
		scan.close();
	}

	public static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
