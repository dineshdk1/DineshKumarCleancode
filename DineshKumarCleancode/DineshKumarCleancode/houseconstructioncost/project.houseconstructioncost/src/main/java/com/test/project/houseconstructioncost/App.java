package com.test.project.houseconstructioncost;

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
        
        System.out.println("enter type of material standard like");
        System.out.println("standard,above standard,high standard");
        String materialstandard=obj.nextLine();
        
        System.out.println("enter total area of house");
        int area=obj.nextInt();
        
        System.out.println("press 1 for fully automated home or else press 0");
        int automatedhome=obj.nextInt();
        
        house housecost=new house();
        housecost.constructioncost(materialstandard,area,automatedhome);
    }
}
