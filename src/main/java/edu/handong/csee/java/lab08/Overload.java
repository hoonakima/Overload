package edu.handong.csee.java.lab08;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average1 = Overload.getAverage(10,20);
		double average2 = getAverage(10.0, 20.0, 30.0); //why no object name?
		char average3 = getAverage ('a', 'c');
		
		
	}
	
	public static double getAverage(int first, int second) {
		return (first + second)/2; 
	}
	
	public static double getAverage(double first, double second, double third) {
		return (first + second + third)/3;
	}
	
	public static char getAverage (char first, char second) {
		return (char)((first + second)/2);
	}
	
}
