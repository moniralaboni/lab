/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tukitaki;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class stars1
{
    public static void main(String[] args)
    {
System.out.println("Enter no of rows to be printed");
Scanner sc = new Scanner(System.in);
 String ln= sc.nextLine();

          int len = Integer.parseInt(ln);
          if( len <= 0)
         {
             System.out.println(" ERROR: Please input a value of 1-5");
             System.exit(0);
         }  

        
        for(int i = 1; i <= len; i++)
        {
                System.out.print("*");
          
        }


    }
} 
