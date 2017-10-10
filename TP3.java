import java.util.Arrays;
import java.util.Scanner;

public class TP3 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Que souhaitez-vous faire ?");
		System.out.println("1. Prompt et Print de tableaux");
		System.out.println("2. Moyenne de tableaux");
		System.out.println("3. Tri de tableaux");
		System.out.println("4. Recherche exhaustive");
		int choix = scan.nextInt();
		switch (choix) {
		case 1:
			exo1();
			break;
		case 2:
			moyennes();
			break;
		case 3:
			tri();
			break;
		case 4:
			recherche();
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

	public static void moyennes() {
		System.out.println("Quel est le nombre de lignes de votre tableau ?");
		int l = scan.nextInt();
		System.out.println("Quel est le nombre de colonnes de votre tableau ?");
		int c = scan.nextInt();
		int[][] array = new int[l][c]; // création dynamique du tableau
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ligne d'indice " + i + " :");
			array[i] = promptIntArray(c); // l'utilisateur entre les valeurs du
											// tableau
		}
		System.out.println("La moyenne de votre tableau est : " + meanIntArray(array)); // calcul
																						// de
																						// la
																						// moyenne
		int found = 0;
		int indice = -1;
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[0].length; k++) {
				if (found == 0) { // itère la variable indice jusqu'à qu'une
									// valeur égale à la moyenne soit trouvée
					indice++;
					if (array[i][k] == meanIntArray(array)) {
						found = 1;
					}
				}
			}
		}

		if (found == 0) {
			System.out.println("Pas de valeur égale à la moyenne.");
		} else {
			System.out.println("La première valeur égale à la moyenne a l'indice " + indice + ".");
		}

		int[] partitioned = new int[array.length * array[0].length]; // création
																		// de la
																		// liste
																		// où
																		// les
																		// valeurs
																		// seront
																		// partitionnées
		int t = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[0].length; k++) {
				if (array[i][k] < meanIntArray(array)) {
					partitioned[t] = array[i][k];
					t++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[0].length; k++) {
				if (array[i][k] >= meanIntArray(array)) {
					partitioned[t] = array[i][k];
					t++;
				}
			}
		}

		System.out.println("Tableau partitionné :");
		printIntArray(partitioned);

	}

	public static void tri() {
		System.out.println("Quel est le nombre de lignes de votre tableau ?");
		int l = scan.nextInt();
		System.out.println("Quel est le nombre de colonnes de votre tableau ?");
		int c = scan.nextInt();
		int[][] array = new int[l][c]; // création dynamique du tableau
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ligne d'indice " + i + " :");
			array[i] = promptIntArray(c); // l'utilisateur entre les valeurs du
											// tableau
		}

		int[] sorted = new int[array.length * array[0].length]; // liste où
																// seront les
																// valeurs
																// triées
		int t = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[0].length; k++) {
				sorted[t] = array[i][k];
				t++;
			}
		}
		Arrays.sort(sorted);
		printIntArray(sorted);
	}

	public static void recherche() {
		System.out.println("Quel est la taille du tableau dans lequel vous souhaitez effectuer la recherche ?");
		int len = scan.nextInt();
		int[] array = promptIntArray(len);
		System.out.println("Que cherchez-vous ?");
		int v = scan.nextInt();
		int index = firstIndex(v, array);
		if (index == -1) {
			System.out.println("Aucune occurence.");
		} else {
			System.out.println("Première occurence à l'indice " + index + ".");
		}

	}

	public static int meanIntArray(int[][] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int t = 0; t < array[i].length; t++) {
				result += array[i][t];
			}
		}
		result = result / (array.length * array[0].length);
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

	public static int firstIndex(int v, int[] array) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (v == array[i]) {
				index = i;
			}
		}
		return index;
	}

}
