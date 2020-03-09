/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Scanner;
/**
 *
 * @author lucanthony
 */

//binary search cuts down your search to half as soon as 
//you find the middle of a sorted list. In linear search, the worst case 
//complexity is O(n), where binary search making O(log n) comparisons.
//Binanry search only work with sorted arrays
public class BinarySearch {
    
    int flag = 0;
    int location = 0;
    
    void binarySearch ()
        {
        
           int arrayValues [] = {10, 20, 33, 49, 55, 66, 67, 77, 89, 98, 99 };
           
           int min = 0;
           int max = 10;
           int left = 5;
           int right = 5;
           int value = 0;
           int middle = 5; 
           
           Scanner sc = new Scanner(System.in);
           
            System.out.println(" \n The Values in the  array are the following: " + arrayValues);

            for (int i = 0; i < arrayValues.length; i++) 
            {
                System.out.println("Array [ "+i+" ] = " + arrayValues[i]);
            }
            
            System.out.println("\n Enter the value you want to search");
            
            value = sc.nextInt();
            
            if(arrayValues [middle] == value)
            {
                flag = 1; 
                location = middle;
            }
            
            else if(value > arrayValues[middle])
            {
            
                for(int i = right; i <= arrayValues.length; i++)
                    {
                        
                        if(arrayValues[i]==value)
                        {
                        
                            flag = 1 ; 
                            location = i;
                        }
                    }
            }
            
            else if(value < arrayValues[middle])
            {
            
                for(int i = left; i >= min; i--)
                    {
                        
                        if(arrayValues[i]==value)
                        {
                        
                            flag = 1 ; 
                            location = i;
                        }
                    }
            }
        }
    
    public static void main(String args []) {
    
    BinarySearch bns = new BinarySearch();
    bns.binarySearch();
    
    if (bns.flag == 0)
        {
            System.out.println("\n Value is not found, sorry!");
        }
    
    else if (bns.flag == 1)
        {
            
            System.out.println("\n Value is found at location" + bns.location );
            
        }
    }
    
}
