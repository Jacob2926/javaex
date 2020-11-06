package CH06;

import java.util.*;

public class Array06 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[10];
		int[] tmp =  new int[arr1.length*3];
//		int[] arr3 = new int[] {10,20,30,40,50,60,70,80,90};
		int[] arr3 = {10,20,30,40,50,60,70,80,90,15,25,35,45,55,65,75,85,95,100};
		char[] chArr = {'a','b','c','d'};
		for(int i =0; i< arr1.length; i++)
			tmp[i] = arr1[i];
		arr1= tmp;
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr3);
		System.out.println(chArr);

	}

}
