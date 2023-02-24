package Pattern_Programming_2.Triangles_Pattern.Right_Triangle_Pattern;

public class Main {
    public static void main(String[] args) {

        // Method 1
        for(int i=1; i<=7; i++){
            String str = "* ";
            System.out.println(str.repeat(i));
         }
 
         // Method 2
         System.out.println(); //for line break or spacing
         int n=7;
         for(int i=0; i<n; i++){
             for(int j=0; j<=i; j++){
                 System.out.print("* ");
             }
             System.out.println(" ");
         }
    }
}
