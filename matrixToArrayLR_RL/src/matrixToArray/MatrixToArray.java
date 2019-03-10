package matrixToArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixToArray {

	static int m, n;
	static Random rand = new Random();
	static int lastA = 0;
	static Scanner sc;

	public static void main(String[] args) {
		System.out.print("Size of input matrix m=");
		sc = new Scanner(System.in);
		m = sc.nextInt();
		System.out.print("Size of input matrix n=");
		sc = new Scanner(System.in);
		n = sc.nextInt();
		int matrix[][] = new int[m][n];
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				matrix[row][col] = rand.nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		System.out.println("Choose direction please for reading:");
		System.out.println("Type 0 for LR");
		System.out.println("Type 1 for RL");
		System.out.print("Your choice: ");
		sc = new Scanner(System.in);
		printArray(matrix, sc.nextInt());
	}

	private static void printArray(int[][] arr, int direction) {
		for (int i = 0; i < m * n; i++) {
			int a = i / n;
			int diff = Math.abs(lastA - a);
			direction = Math.abs(direction - diff);
			int var = (n - 1) * direction;
			int b = Math.abs(var - i % n);
			System.out.println(arr[a][b]);
			lastA = a;
		}

	}

}
