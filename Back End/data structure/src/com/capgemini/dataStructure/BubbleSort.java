package com.capgemini.dataStructure;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
public void bubbleSort(int[] arr) {
	int n=arr.length;
	int temp=0;
	for(int i=0;i<n;i++) {
		for(int j=1;j<(n-i);j++) {
			if(arr[j-1]>arr[j]) {
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Elements after Bubble sort:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}

public void countingDuration1(int arr[]) {
	
	Instant start=Instant.now();
	//System.out.println("bubble sort duration: "+bubbleSort(arr));
	Instant end=Instant.now();
	long duration=Duration.between(start, end).toMillis();
	double seconds=duration/1000.0;
}
}
