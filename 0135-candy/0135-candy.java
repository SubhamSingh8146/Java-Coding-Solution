class Solution {
    public int candy(int[] ratings) {
        int res = 0, n = ratings.length;
        int candies1[] = new int[n];
        int candies2[] = new int[n];

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]) {
                candies1[i] = candies1[i-1]+1;
            }
            if (ratings[n-1-i] > ratings[n-i]) {
                candies2[n-1-i] = candies2[n-i]+1;
            }
        }
        for (int i = 0; i < n; i++) {
            res+= Math.max(candies1[i], candies2[i]);
        }
        return res+n;
    }
}