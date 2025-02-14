import java.util.*;

class Solution {
    public boolean isGoodArray(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x = gcd(x, num);
        }
        return x == 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {12, 5, 7, 23}; 
        System.out.println(sol.isGoodArray(nums)); // Example usage
    }
}
