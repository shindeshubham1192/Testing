package com.github;

public class Demo {
	
	public void m1()
	{
		System.out.println("M1 method is called");
	}
	public void m2()
	{
		System.out.println("M2 method is called");
	}
	public void add()
	{
		System.out.println("add method is called");
	}
	public static void main(String[] args) 
	{
		System.out.println("hello this is first github project");
		
		Demo d = new Demo();
		d.m1();
		d.m2();
		d.add();
	}
}
