package Java_Introduction._10_Arrays_In_Java._2_Multi_Dimensional_Arrays.Examples;

public class Example3 {
    public static void main(String[] args) {
        // create a 3D array of integers with dimensions 2 x 3 x 4
        int[][][] cube = new int[2][3][4];

        // assign values to the array elements
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = i * 100 + j * 10 + k;
                }
            }
        }

        // print the values of the array elements
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Cube " + (i + 1) + ":");
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
