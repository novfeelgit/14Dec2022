package com.ctc;

public class Sample {	
	private void add() {
		int day = 3 ;
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
			
		case 100:
			System.out.println("Novfeel");
			break;
			
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("No day available");
			break;
		}		
}
		public static void main(String[] args) {
			Sample s= new Sample();
			s.add();
		}
}