package task;

import java.util.Scanner;

public class Primenumberp {

	public static void main(String[] args) {
		int num=4;
		int temp=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
			System.out.println("Given number is  a prime number. ");
		else
			System.out.println("Given number is not a prime number.");
	
	

	
	}
	
	
	
}
