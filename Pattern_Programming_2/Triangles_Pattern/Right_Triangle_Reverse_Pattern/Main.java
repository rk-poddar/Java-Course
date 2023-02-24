package Pattern_Programming_2.Triangles_Pattern.Right_Triangle_Reverse_Pattern;

public class Main
{
	public static void main(String[] args) {
	    
	    // Method 1
	    int n=7;
        for(int i=0; i<=n; i++){
            for(int j=n-i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
        // Method 2
        // int n=7;
        System.out.println();
        for(int i=n; i>=0; i--){
            for(int j=i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
        // Method 3
        System.out.println();
        for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        if(j==0 || i+j<=(n-1) || i==0){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println("");
		}
	}
}
