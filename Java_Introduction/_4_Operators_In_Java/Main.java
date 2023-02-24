package Java_Introduction._4_Operators_In_Java;

public class Main {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println("c = " + c); // Output: c = 13
        System.out.println("d = " + d); // Output: d = 7
        System.out.println("e = " + e); // Output: e = 30
        System.out.println("f = " + f); // Output: f = 3
        System.out.println("g = " + g); // Output: g = 1

        // Relational Operators
        boolean h = (a > b);
        boolean i = (a <= b);
        boolean j = (a == b);
        boolean k = (a != b);
        System.out.println("h = " + h); // Output: h = true
        System.out.println("i = " + i); // Output: i = false
        System.out.println("j = " + j); // Output: j = false
        System.out.println("k = " + k); // Output: k = true

        // Logical Operators
        boolean l = (a > b) && (a < 20);
        boolean m = (a > b) || (a < 5);
        boolean n = !(a > b);
        System.out.println("l = " + l); // Output: l = true
        System.out.println("m = " + m); // Output: m = true
        System.out.println("n = " + n); // Output: n = false

        // Bitwise Operators
        int p = 5; // Binary: 101
        int q = 3; // Binary: 011
        int r = p & q; // Bitwise AND
        int s = p | q; // Bitwise OR
        int t = p ^ q; // Bitwise XOR
        int u = ~p; // Bitwise complement
        int v = p << 1; // Left shift
        int w = q >> 1; // Right shift
        System.out.println("r = " + r); // Output: r = 1
        System.out.println("s = " + s); // Output: s = 7
        System.out.println("t = " + t); // Output: t = 6
        System.out.println("u = " + u); // Output: u = -6
        System.out.println("v = " + v); // Output: v = 10
        System.out.println("w = " + w); // Output: w = 1

        // Ternary Operator
        int x = 5;
        String result = (x > 10) ? "greater than 10" : "less than or equal to 10";
        System.out.println("Result: " + result); // Output: Result: less than or equal to 10
    }
}

