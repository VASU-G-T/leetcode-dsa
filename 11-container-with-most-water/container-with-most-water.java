class Solution {
    public int maxArea(int[] h) {

        int m = 0;
        int l = 0;
        int r = h.length - 1;

        while (l < r) {

            int w = r - l;
            int ch = Math.min(h[l], h[r]);
            int area = w * ch;

            m = Math.max(m, area);

            if (h[l] < h[r]) {
                l++;
            } else {
                r--;
            }
        }

        return m;
    }
}