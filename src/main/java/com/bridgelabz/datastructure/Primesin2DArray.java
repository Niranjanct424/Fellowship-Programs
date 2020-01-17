/* Purpose: Determines prime numbers till 1000 stores in 2d array
 *
 *  @author  Niranjan.c.t
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class Primesin2DArray 
{
	int[][] arr = new int[10][50];
	int[] pr = new int[170];
	int h =0;
	int k5 =0,k6 = 0;
	public int prime()
	{
		
		for(int i= 1; i<1000; i++)
		{
			int temp = 0;
			for(int j=2; j<i;j++)
			{
				if(i%j==0)
				{
					temp = temp+1;
					break;
				}
			}
				if(temp == 0)
				{
					pr[h] = i;
					h++;	
				}
		}
		for(int i=0;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 100)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
				
			}
		}
		System.out.println();
		for(int i=1;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 200 && pr[k5]>100)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}
		System.out.println();
		for(int i=2;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 300)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
				
			}
		}
		System.out.println();
		for(int i=3;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 400)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
				
			}
		}
		System.out.println();
		for(int i=4;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 500)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}
		System.out.println();
		for(int i=5;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 600)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}
		System.out.println();
		for(int i=6;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 700)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}
		System.out.println();
		for(int i=7;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 800)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}
		
		System.out.println();
		for(int i=8;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 900)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}
		System.out.println();
		for(int i=9;i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(pr[k5] < 997)
				{
					arr[i][j] = pr[k5];
					k5++;
				}
			}
		}	
			return 0;	
	}
	public static void main(String[] args) 
	{
		Primesin2DArray p = new Primesin2DArray();
		p.prime();
		for(int i=0;i<=9; i++)
		{System.out.println();
			for(int j=0; j<50; j++)
			{
				System.out.print(p.arr[i][j]+" ");
			}
		}
	}
}
