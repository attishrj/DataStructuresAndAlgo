package com.ques.geeksTest.array;

import java.util.Arrays;

public class MajorityTest {
	public static void main(String[] args) {

	/*	int[] ar = { 616, 202, 389, 483, 832, 67, 416, 694, 37, 957, 166, 29, 293, 671, 760, 400, 696, 16, 878, 710,
				513, 155, 651, 494, 943, 972, 376, 84, 715, 34, 226, 41, 841, 76, 107, 659, 870, 616, 514, 846, 275,
				679, 679, 359, 226, 830, 210, 469, 105, 173, 208, 370, 339, 801, 664, 501, 986, 719, 61, 645, 643, 603,
				275, 926, 631, 913, 501, 557, 568, 680, 488, 339, 791, 132, 970, 65, 981, 585, 289, 27, 42, 271, 307,
				374, 414, 178, 818, 187, 815, 832, 303, 451, 774, 222, 181, 263, 719, 276, 411, 616, 569, 701, 976, 196,
				513, 916, 330, 970, 265, 808, 372, 535, 334, 636, 689, 695, 150, 266, 565, 420, 346, 690, 916, 86, 469,
				192, 293, 30, 251, 782, 521, 21, 778, 249, 771, 209, 40, 276, 185, 620, 10, 980, 788, 404, 849, 731,
				417, 982, 160, 379, 910, 781, 117, 926, 687, 723, 394, 872, 712, 510, 67, 86, 140, 843, 546, 431, 6, 31,
				306, 976, 845 };*/
		int[] ar={1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("majority " + MajorityTest.majorityWins(ar, ar.length, 1, 77777777));
	}

	public static int majorityWins(int arr[], int n, int x, int y) {
		Arrays.sort(arr);
		int count_x = 0;// counter to count frequency of x
		int count_y = 0;// counter to count frequency of y
		int result=0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				count_x++;
			}
			if (arr[i] == y) {
				count_y++;
			}
		}
		  if(count_x!=0&&count_y!=0)
		  {
			  
			  result = count_x != count_y ? (count_x>count_y?x:y) : (x<y?x:y);
		  }
		  return result;
	}

}
