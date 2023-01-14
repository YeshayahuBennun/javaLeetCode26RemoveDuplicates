
public class Solution {
    public static void main(String[] args) {

        int[] case1 = {1, 1, 2};
        int[] case2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(case2));

    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }

}
