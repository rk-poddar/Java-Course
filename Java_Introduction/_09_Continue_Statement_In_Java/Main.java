package Java_Introduction._9_Continue_Statement_In_Java;

public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("The value of i is " + i);
        }        
    }
}
