package Java_Introduction._10_Arrays_In_Java._3_Anonymous_Arrays;

class Calc
{
    int add(int num[]){
        int result = 0;
        for(int n : num){
            result = result+n;
        }
        return result;
    }
}

public class Main
{
	public static void main(String[] args) {
	   // int num[] = {5,5,5,5};
		Calc obj = new Calc();
		int result = obj.add(new int[]{5,5,5,5}); //anonymous array
		System.out.println(result);
		
	}
}
