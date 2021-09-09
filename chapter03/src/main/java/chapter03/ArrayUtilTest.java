package chapter03;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40};
//		double[] arr2 = new double[arr1.length];
		double[] arr2 = ArrayUtil.intToDouble(arr1);
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = (double) arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}
