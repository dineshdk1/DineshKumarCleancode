package com.test.cleancode.simpleandcompoundinterest;

public class simpleinterest {
	void calculate(double principle,double rate,double time)
	{
		double amount=( principle* rate * time ) /100;
		System.out.println("Simple Interest="+amount);
	}

}
