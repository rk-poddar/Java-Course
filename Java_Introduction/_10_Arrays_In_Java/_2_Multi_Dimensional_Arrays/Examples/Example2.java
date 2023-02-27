package Java_Introduction._10_Arrays_In_Java._2_Multi_Dimensional_Arrays.Examples;

public class Example2 {
    public static void main(String[] args) {
        // create a 3D array of strings with dimensions 2 x 2 x 2
        String[][][] cube = {
            {
                {"000", "001"},
                {"010", "011"}
            },
            {
                {"100", "101"},
                {"110", "111"}
            }
        };

        // print the values of the array elements
        for (int i = 0; i < cube.length; i++) {
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
