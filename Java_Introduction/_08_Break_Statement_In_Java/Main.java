package Java_Introduction._8_Break_Statement_In_Java;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break;
            }
            System.out.println("The value of i is " + i);
            i++;
        }
    }
}
