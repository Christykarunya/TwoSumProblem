package week1.day2;

public class TwoSumProgram {

	public static void main(String[] args) {
		int nums[] = {2,11,15,7,3,5,4,8,1};
		int target= 9;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if((nums[i]+nums[j])==target) {
					System.out.println(nums[i] + "with index" + i);
					System.out.println(nums[j] + "with index" + j);
				}
			}
			
		}
		
	}

}
