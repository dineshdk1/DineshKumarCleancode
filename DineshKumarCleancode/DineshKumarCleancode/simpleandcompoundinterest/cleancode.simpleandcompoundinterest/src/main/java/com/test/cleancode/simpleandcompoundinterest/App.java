package com.test.cleancode.simpleandcompoundinterest;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter principle amount");
        double principle=obj.nextDouble();
        
        System.out.println("Enter interest rate");
        double rate=obj.nextDouble();
        
        System.out.println("Enter time period");
        double time=obj.nextDouble();
        
        simpleinterest simpleinterestobject=new simpleinterest();
        simpleinterestobject.calculate(principle,rate,time);
        
        compoundinterest compoundinterestobject= new compoundinterest();
        compoundinterestobject.calculate(principle,rate,time);
        
    }
}
