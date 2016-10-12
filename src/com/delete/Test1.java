package com.delete;

public class Test1 {
	public static void main(String[] args) {
		Parent obj =new child();
	 	child objchi = (child) obj.m1(12);
	 	objchi.m1(0);
		
	}
	}
	class Parent{
		public Parent m1(int i){
			System.out.println("Parent M1 :"+i);
			
			return new child();
		}
		
	}
	class child extends Parent{
		public child m1(int i){
			System.out.println("Child M1");
			return this;
		}
		
	}
	

