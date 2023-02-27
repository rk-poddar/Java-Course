package Java_Introduction._10_Arrays_In_Java._2_Multi_Dimensional_Arrays.Examples;

public class _2D_Array_With_Default_Value
{
	public static void main(String[] args) {
		int num[][] = new int[4][4];
		
		for(int i=0; i<num.length; i++){
		    for(int j=0; j<num[i].length; j++){
		        System.out.print(num[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
