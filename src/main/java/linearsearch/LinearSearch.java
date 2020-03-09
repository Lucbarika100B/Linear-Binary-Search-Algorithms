/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

//importing scanner class for user inputs;
import java.util.Scanner;
/**
 *
 * @author lucanthony
 */

//A linear search scans one item at a time, without jumping to any item


//creating a class for our algorithm
public class LinearSearch {
    public static void main (String [] args) {
    
        int array [] = {199, 00, 87, 66, 35, 434, 88, 54, 90, 34};
        int location = 0;
        int value = 0;
        int flag = 0;
        
        System.out.println("\nValue in Array are following: ");
        
        for (int i =0; i < array.length; i++)
            {
                System.out.println(array[i]);  
            }
        System.out.println("\nEnter the value that you want to search for in the Array : ");
        
        Scanner scan = new Scanner(System.in);
        
        value = scan.nextInt();
        
        for(int i = 0; i < array.length; i ++) 
            
        {
            if (array[i] == value)
            {
                flag = 1;
                location = i;
            }
         }
        if (flag ==0)
        {
            System.out.println("\nValue is not found, sorry!");
        }
        
        else 
        {
         
            System.out.println("\n Value is found at Array location" + location);
        
        }
    }
    
    
}


