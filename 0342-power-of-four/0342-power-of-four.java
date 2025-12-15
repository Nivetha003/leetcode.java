class Solution {
    private boolean func(int copy) {
        if (copy == 1) return true;
        if (copy == 0 || copy % 4 != 0) return false;
        return func(copy / 4);
    }
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        return func(n);
    }
}