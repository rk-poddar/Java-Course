package Java_Introduction._10_Arrays_In_Java._2_Multi_Dimensional_Arrays;

public class Main {
	public static void main  (String[] args) {

        // Method 1
		int num[][] = {
        				{1, 2, 3},
        				{4, 5, 6},
        				{7, 8, 9}
                    };

		System.out.println("2D Array is:");
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        // Method 2
        // create a 2D array of integers with 3 rows and 4 columns
        int[][] matrix = new int[3][3];

        // assign values to the array elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // print the values of the array elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
