import java.util.Scanner;


public class MyMain 
{
	static int array[]=new int [10];
	static Scanner scn = new  Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("設定資料");
		CompterCounter();
		System.out.println("統計資料");
		print();

	}

	public static void CompterCounter()
	{
		int number;
		System.out.print("請輸入10個數字(0~100):");
		for(int i=0;i<10;i++)
		{
			
			int in = scn.nextInt();
			if (in>=0 && in<=100)
			{
				if(in/10==10)
					array[9]++;
				else
					array[in/10]++;
			}
		}
	}
	
	public static void print()
	{
		for(int i=1;i<=10;i++)
		{
			if(i<10)
				System.out.println(i*10-10+"-"+(i*10-1)+" = "+array[i-1]);
			else
				System.out.println(i*10-10+"-"+(i*10)+" = "+array[i-1]);
		}
	}
}
