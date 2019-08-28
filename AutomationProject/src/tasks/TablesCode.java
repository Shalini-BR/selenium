package tasks;

import java.util.Scanner;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.annotations.Test;

public class TablesCode {
	@Test
	public static void main(String args[])
	{	
		
		Scanner sc = new Scanner(System.in); // object for scanner
		System.out.println("Enter the table No : ");
		int i = sc.nextInt();
		System.out.println("Table : " + i);
		
		int j=1;
		
			for(j=1;j<=10;j++)
			{
				
				System.out.println(i + " * " + j + " = " + i*j );
			}
		}
	
}
