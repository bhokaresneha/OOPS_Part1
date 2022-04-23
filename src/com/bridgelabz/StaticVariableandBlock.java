/* Problem Statement=>
2. Write a Program to demonstrate the use of the static variable, blocks.
 * */

package com.bridgelabz;
public class StaticVariableandBlock {

    static int c=100;//Static Variable
    static  int d;

    static  void StaticVariableandBlock(int a){
       System.out.println("Value of a is " + a );
        System.out.println("value of d="+d);
        }
    //Static Block
    static{
        System.out.println("Inside the Static Block");
        d=c*5;
    }

    public static void main(String[] args) {
        StaticVariableandBlock d2s= new StaticVariableandBlock();
        StaticVariableandBlock(100);

    }

}
