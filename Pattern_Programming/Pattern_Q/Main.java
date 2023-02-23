package Pattern_Q;

public class Main
{
public static void main(String[] args) {
		
		int n=7;
		
		for(int i=0; i<n; i++){
		    for(int j=0; j<n; j++){
		        if(i==0 && j>0 && j<(n-1)
		        || j==0 && i>0 && i<(n-1)
		        || i==(n-1) && j>0 && j<(n-2)
		        || j==(n-1) && i>0 && i<(n-2)
		        || i==j && i>(n-1)/2)
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
