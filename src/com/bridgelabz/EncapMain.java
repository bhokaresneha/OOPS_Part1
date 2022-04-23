/* Problem Statement=>
3. Write a Program to demonstrate the Java Encapsulation.
 * */
package com.bridgelabz;
public class EncapMain
{
    public static void main(String[] args)
    {
        Encapsulation encap = new Encapsulation();
        encap.setEmpId(20);
        encap.setEmpName("James");

        System.out.println(" Id : " + encap.getEmpId()+ "    "+"Name : " + encap.getEmpName() ) ;
    }
}
