package easy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 3;
        int[] nums = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int target = scanner.nextInt();
        int[] result = solution.twoSum(nums,target);
        for (int element:result){
            System.out.println(element);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0;i < nums.length;i++) {
            if (i == nums.length) break;

            for (int j = i;j < nums.length;j++) {
                if (i==j) continue;

                if (nums[i] + nums[j] == target) {
                    int[] result = {i,j};
                    return result;
                }
            }

        }

        return null;
    }
}