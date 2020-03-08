package com.test.project.houseconstructioncost;

public class house {

	void constructioncost(String materialstandard,int area,int automatedhome)
	{
		if(automatedhome==1 && materialstandard.equals("high standard"))
		{
			int cost=2500 * area;
			System.out.println("house construction cost="+cost);
		}
		else if(materialstandard.equals("high standard"))
		{
			int cost=1800 * area;
			System.out.println("house construction cost="+cost);
		}
		else if(materialstandard.equals("above standard"))
		{
			int cost=1500 * area;
			System.out.println("house construction cost="+cost);
		}
		else if(materialstandard.equals("standard"))
		{
			int cost=1200 * area;
			System.out.println("house construction cost="+cost);
		}
		else
		{
			System.out.println("enter the correct given options");
		}
		
	}
}
