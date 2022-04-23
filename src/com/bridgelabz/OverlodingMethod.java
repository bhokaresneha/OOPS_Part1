/* Problem Statement=>
5. Write a Program to demonstrate the Polymorphism with types method overloading andmMethod overriding in Java
 * */

package com.bridgelabz;

public class OverlodingMethod {
    int side ;
    int length;
    int breadth;
    public void CalculateArea(int side)
    {
        System.out.println("Area of square"+side*side);
    }
    public void CalculateArea(int length,int breadth)
    {
        System.out.println("Area of square"+length*breadth);
    }
    public void CalculateArea(String figure){
        int area=27;
        System.out.println("Area of "+figure+"is"+area);

    }
    public static void main(String[] args)
    {
        OverlodingMethod om=new OverlodingMethod();
        om.CalculateArea(4,4);

        om.CalculateArea(5);

        om.CalculateArea("circle");
    }
}
