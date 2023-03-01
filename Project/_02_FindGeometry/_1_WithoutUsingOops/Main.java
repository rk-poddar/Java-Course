package Project._02_FindGeometry._1_WithoutUsingOops;

import java.util.Scanner;

class Rectangle{

    float length;
    float breadth;
    float area;

    public void Input(){
        System.out.println("Calculation of Rectangle :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth: ");
        breadth = sc.nextFloat();
    }

    public void Compute(){
        area = length * breadth;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        System.out.println("1. Area of Rectangle ");
        System.out.println("2. Area of Square ");
        System.out.println("3. Area of Circle ");
        int number = sc.nextInt();

        switch(number){
            case 1:
                Rectangle re = new Rectangle();
                re.Input();
                re.Compute();
                re.Display();
            break;

            case 2:
                Square sq = new Square();
                sq.Input();
                sq.Compute();
                sq.Display();
            break;

            case 3:
                Circle cr = new Circle();
                cr.Input();
                cr.Compute();
                cr.Display();
            break;

            default:
                System.out.println("Invalid Input..! Try again...");
                
        }  

        sc.close();
    }
}
