package com.capgemini.dataStructure;

import java.util.Scanner;

public class DataStructureMain {
 
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter size of array");
 int size=scan.nextInt();
int arr[]=new int[size];

System.out.println("enter "+size+" array elements");
for(int i=0;i<size;i++) {
	arr[i]=scan.nextInt();
	
}
System.out.println("Array elements are:");
for(int i=0;i<size;i++) {
	System.out.print(arr[i]+" " );
	
}
BubbleSort b=new BubbleSort();
b.countingDuration1(arr);

System.out.println();
b.countingDuration1(arr);
//new BubbleSort().bubbleSort(arr);
System.out.println();
//new SelectionSort().selectionSort(arr);


	}

}
