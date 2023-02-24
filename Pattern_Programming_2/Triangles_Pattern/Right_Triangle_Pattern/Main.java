package Pattern_Programming_2.Triangles_Pattern.Right_Triangle_Pattern;

public class Main {
    public static void main(String[] args) {

        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
