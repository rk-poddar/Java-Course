package Projects._02_FindGeometry._2_UsingOops;

import java.util.Scanner;


abstract class Shape{

    float area;

    abstract public void input();
    abstract public void compute();
    
    public void disp(){
        System.out.println("The area is "+ area);
    }
}

class Rectangle extends Shape{

    float length;
    float breadth;

    public void input(){
        System.out.println("Calculation of Rectangle :");
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter length: ");
        length=scan.nextFloat();
        System.out.print("Please enter breath: ");
        breadth=scan.nextFloat();

    }

    public  void compute(){
        area=length*breadth;
    }  
}

class Square extends Shape{

    float length;
   
    public void input(){
        System.out.println("Calculation of Square :");
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter length: ");
        length=scan.nextFloat();
       

    }

    public  void compute(){
        area=length*length;
    } 
}

class Circle extends Shape{

    float radius;
    
    public void input(){
        System.out.println("Calculation of Circle :");
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter radius: ");
        radius=scan.nextFloat();
       
    }

    public  void compute(){
        area=3.14f* radius * radius;
    } 
}

class Geometry{
    public void poly(Shape ref){
        ref.input();
        ref.compute();
        ref.disp();

    }
}


public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        System.out.println("1. Area of Rectangle ");
        System.out.println("2. Area of Square ");
        System.out.println("3. Area of Circle ");
        int number = sc.nextInt();
        
        Geometry g=new Geometry();

        switch(number){
            
            case 1:
                Rectangle rec=new Rectangle();
                g.poly(rec);
                break;

            case 2:
                Square sq=new Square();
                g.poly(sq);
                break;

            case 3:
                Circle c=new Circle();
                g.poly(c);
                break;

            default:
                System.out.println("Invalid Input..! Try again...");
        }

        sc.close();
        
    }  
}
