/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import java.util.Scanner;
public class NewClass {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        int c = (int) (Math.random()*10);
        System.out.println("write the sum of " + a + "+" + b + "+" + c);
        int sum = input.nextInt();
        if (sum == a+b+c)
            System.out.println("true");
        else 
            System.out.println("False");
        
        
    }
}
