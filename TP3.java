import java.util.Scanner;

public class TP3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		exo1();
		scan.close();

	}

	public static void exo1() {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[4];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Nombre d'indice " + i + " ?");
			array[i] = scan.nextInt();
		}

		printIntArray(array);
		scan.close();
	}

	public static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
