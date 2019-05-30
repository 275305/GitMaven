package com.string;

import java.util.Scanner;

public class NumberSorting {
	
	public static void main(String[] args) {
		int i,j;
		int temp;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the No");
		int num=Sc.nextInt();
		 int arr[]=new int[num];
		for(i=0;i<num;i++) 
		arr[i]= Sc.nextInt();
		
		for(i=0;i<num;i++)
		{
		for(j=i;j<num-i-1;j++)
		{  if(arr[i]>arr[j+1])
		   {
			  temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
		      }
		  }
		} 
		for(i=0;i<num;i++)
		System.out.print(arr[i]);
		 	}

}
