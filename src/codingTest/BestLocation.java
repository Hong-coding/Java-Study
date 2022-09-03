package codingTest;

import java.util.Arrays;
import java.util.List;

public class BestLocation {

	public static void main(String[] args) {
		int num = 3;
		String[] str = {"1", "3", "5"};
		int [] houseLocation = new int[num];
		for(int i = 0; i < num ; i++) {
			houseLocation[i] = Integer.parseInt(str[i]);
		}
		int [] antenna = new int[num];
		int wireLength = 0;
//		int[] length = 
		for(int list : houseLocation) {
			for(int list2 : houseLocation) {
				wireLength = list-list2;
			}
		}
	}
}
