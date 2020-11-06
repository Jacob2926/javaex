package CH07;

//package src.sec08.exam01_method.declaration;

public class test6 {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0 ;
		for(int i=0; i <values.length; i++){
			sum += values[i];
		}
		return sum;
	}

}
