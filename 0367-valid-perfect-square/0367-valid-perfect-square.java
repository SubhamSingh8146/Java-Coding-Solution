class Solution {
    public boolean isPerfectSquare(int n) {
        long high = n, low = 0, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * mid == n) return true;
            if (mid * mid < n) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
