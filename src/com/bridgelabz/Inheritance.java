/* Problem Statement=>
5. Write a Program to demonstrate the Polymorphism with types method overloading andmMethod overriding in Java
 * */

package com.bridgelabz;
class Arithmatic{
    void Add()
    {
       int a=10,b=20,sum;
       sum=a+b;
        System.out.println("sum"+sum);
    }
}
class Math extends Arithmatic{
    void Add()
    {
        int a=50,b=20,sum;
        sum=a+b;
        System.out.println("sum"+sum);
    }
    void Sub()
    {

            int a=40,b=20,sub;
            sub=a-b;
            System.out.println("sub"+sub);
    }
    void Assignment()
    {
        super.Add();
        Sub();
    }
}
class Inheritance
{
    public static void main(String args[])
    {
        Math d=new Math();
        d.Assignment();
    }
}
