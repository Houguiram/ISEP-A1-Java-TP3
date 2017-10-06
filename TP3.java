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
		int[] array = promptIntArray(4);

		printIntArray(array);

		System.out.println("Tableau à 3 lignes et 4 colonnes :");
		int[][] bigArray = new int[3][4];
		for (int i = 0; i < bigArray.length; i++) {
			System.out.println("Ligne d'indice " + i + " :");
			bigArray[i] = promptIntArray(4);
		}
		for (int i = 0; i < bigArray.length; i++) {
			printIntArray(bigArray[i]);
		}

	}
	
	public static void moyennes(){
		System.out.println("Quel est le nombre de lignes de votre tableau ?");
		int l = scan.nextInt();
		System.out.println("Quel est le nombre de colonnes de votre tableau ?");
		int c = scan.nextInt();
		int[][] array = new int[l][c];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ligne d'indice " + i + " :");
			array[i] = promptIntArray(c);
		}
		System.out.println("La moyenne de votre tableau est : " + meanIntArray(array));
		
	}
	
	public static int meanIntArray(int[][] array){
		int result = 0;
		for (int i = 0; i < array.length; i++){
			for (int t = 0; t < array[i].length; t++){
				result += array[i][t];
			}
		}
		result = result / (array.length * array[1].length);
		return result;
	}

	public static int[] promptIntArray(int arrayLength) {
		int[] array = new int[arrayLength];

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
