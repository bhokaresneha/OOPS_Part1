/* Problem Statement=>
 * 1. Write a Program to define the Default constructor (no-arg constructor) and Parameterized constructor.
 * */
package com.bridgelabz;
public class DefandParaConstructorClass
{
    public int a1,b1;
    public DefandParaConstructorClass()
    {
        System.out.println("Default constructor called ");
    }
    public DefandParaConstructorClass(int a ,int b )
    {
            this.a1=a;
            this.b1=b;
            int add=a1+b1;
        System.out.println("addition"+add);
    }
    public static void main(String[] args)
    {
        DefandParaConstructorClass dpc=new DefandParaConstructorClass();
        DefandParaConstructorClass dpc1=new DefandParaConstructorClass(10,20);

    }
}
