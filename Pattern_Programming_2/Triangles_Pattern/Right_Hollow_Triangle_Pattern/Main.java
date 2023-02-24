package Pattern_Programming_2.Triangles_Pattern.Right_Hollow_Triangle_Pattern;

public class Main
{
	public static void main(String[] args) {
	    
		int n=7;
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        if(j==0 || i==j || i==n-1){
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
