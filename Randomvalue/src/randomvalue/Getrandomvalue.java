package randomvalue;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Getrandomvalue {
	public static void main(String[] args) 
	{
		int val;
		
		StringBuilder bu = new StringBuilder();
		
		System.out.println("Enter The value :");
		Scanner input=new Scanner(System.in);
		int range=input.nextInt();
		int min=0,max=range-1;
		 
		Random rand=new Random();
		val=rand.nextInt((max-min)+1)+min;
	
		System.out.println(val);
	}

}
