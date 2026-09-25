class Solution {
    public int[][] transpose(int[][] x) {

        int[][] m = new int[x[0].length][x.length];

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < x[i].length; j++) {

                m[j][i] = x[i][j];
            }
        }

        return m;
    }
}