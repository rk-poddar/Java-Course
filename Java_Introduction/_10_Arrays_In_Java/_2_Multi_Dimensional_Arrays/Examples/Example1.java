package Java_Introduction._10_Arrays_In_Java._2_Multi_Dimensional_Arrays.Examples;

import java.util.Scanner;

public class Example1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // prompt the user for the number of rows and columns
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();

    System.out.print("Enter the number of columns: ");
    int columns = sc.nextInt();

    // create a 2D array with the specified number of rows and columns
    int[][] matrix = new int[rows][columns];

    // prompt the user for the elements of the 2D array
    System.out.println("Enter the elements of the 2D array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    // print the elements of the 2D array
    System.out.println("The 2D array is:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}



