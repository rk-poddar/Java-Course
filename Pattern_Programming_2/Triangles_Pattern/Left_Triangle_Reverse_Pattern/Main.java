package Pattern_Programming_2.Triangles_Pattern.Left_Triangle_Reverse_Pattern;

public class Main
{
	public static void main(String[] args) {
	    
	    int n=7;
        for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        if(j==n-1 || i<=j || i==0){
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
