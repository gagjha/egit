package pkg;

import java.util.Scanner;

public class Runner {

public static void main(String args[]){
	inter obj = new cal();
	Scanner i = new Scanner(System.in);
	System.out.println("enter the choise 1:Add 2:mul");
	int c=i.nextInt();
	int x=i.nextInt();
	int y=i.nextInt();
	switch(c)
	{
	case 1:
		System.out.println((obj).add(x,y));
		System.out.println("ok");
		break;
	case 2:
		System.out.println(obj.mult(x, y));
	}
}
}
