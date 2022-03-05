public class HackerRank {


    public static int hourglassSum(int[][]arr){
        // the lowest number possible in an hourglass is 6, -9 which is -63
        int maxNum = -63;
        for (int row = 0; row < arr.length-2; row++) {
            for (int col = 0; col < arr[0].length-2; col++) {
                int sum = 0;
                sum = (arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]);
                        if(sum > maxNum){
                            maxNum = sum;
                        }
            }
        }
        return maxNum;
    }
}
