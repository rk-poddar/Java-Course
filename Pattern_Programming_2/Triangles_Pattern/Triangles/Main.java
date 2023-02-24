package Pattern_Programming_2.Triangles_Pattern.Triangles;

public class Main
{
	public static void main(String[] args) {
		
		int n=7;
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        if(j==0 || i==(n-1) 
		        || i==j)
		        {
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.print("  ");
		    for(int j=0; j<n; j++){
		        if(i+j==(n-1)/2 
		        || j-i==(n-1)/2 
		        || i==(n-1)/2)
		        {
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.print("  ");
		    for(int j=0; j<n; j++){
		        if(j==(n-1) || i==(n-1) 
		        || i+j==(n-1))
		        {
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    
		    System.out.println();
		}
		
	}
}
