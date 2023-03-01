package Java_Introduction._10_Arrays_In_Java._1_Single_Dimensional_Arrays;

public class Main
{
	public static void main(String[] args) {
	    
	    int n[] = {1,2,3,4,5};
	    
	    for(int i=0; i<n.length; i++){
	        System.out.print(n[i]+" ");
	    }
	    
	    System.out.println();
	    
        // create an array of integers with 5 elements
	    int a[] = new int [5];

        // assign values to the array elements
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
        // print the values of the array elements
		for(int x : a){
		    System.out.print(x+" ");
		}	
	}
}

