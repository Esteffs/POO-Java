package application;

import java.util.Scanner;

public class Program 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Instanciando a matriz
		int [][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) // percorre linhas
		{
			for (int j = 0; j < n; j++) //percorre colunas
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Diagonal principal
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(mat [i][i] + " " );
		}
		System.out.println();
		
		//Contando números negativos na matriz
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (mat [i][j] < 0)
				{
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
		sc.close();

	}

}
