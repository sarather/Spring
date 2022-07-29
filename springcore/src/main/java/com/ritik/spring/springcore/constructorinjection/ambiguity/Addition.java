package com.ritik.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	Addition(double a,double b){
		System.out.println("Inside double constructor");
	}
	Addition(int a,int b){
		System.out.println("Inside integer constructor");
	}

}
