class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);

        int max = 0;

        // Before first special floor
        max = Math.max(max, special[0] - bottom);

        // Between special floors
        for (int i = 1; i < special.length; i++) {
            max = Math.max(max, special[i] - special[i - 1] - 1);
        }

        // After last special floor
        max = Math.max(max, top - special[special.length - 1]);

        return max;
    }
}