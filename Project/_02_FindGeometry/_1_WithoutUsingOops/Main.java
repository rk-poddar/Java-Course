package Project._02_FindGeometry._1_WithoutUsingOops;

import java.util.Scanner;

class Rectangle{

    float length;
    float breath;
    float area;

    public void Input(){
        System.out.println("Calculation of Rectangle :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextFloat();
        System.out.print("Enter the length: ");
        breath = sc.nextFloat();
    }

    public void Compute(){
        area = length * breath;
    }

    public void Display(){
        System.out.println("The area of a Rectangle is " + area);
    }

}

class Square{

    float length;
    float area;

    public void Input(){
        System.out.println("Calculation of Square :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextFloat();
    }

    public void Compute(){
        area = length * length;
    }

    public void Display(){
        System.out.println("The area of a Square is " + area);
    }

}

class Circle{

    float radius;
    float area;

    public void Input(){
        System.out.println("Calculation of Circle :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextFloat();
    }

    public void Compute(){
        area = 3.14f * radius * radius;
    }

    public void Display(){
        System.out.println("The area of a Circle is " + area);
    }

}


public class Main {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.Input();
        re.Compute();
        re.Display();

        Square sq = new Square();
        sq.Input();
        sq.Compute();
        sq.Display();

        Circle cr = new Circle();
        cr.Input();
        cr.Compute();
        cr.Display();
    }
}
