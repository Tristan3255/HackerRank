public class Runner {

    public static void main(String[] args) {
        int[][] arr1 = {{-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}}; //result should be 28

        int[][] arr2 = {{1, 1, 1, 0, 0, 0},                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}; //result should be 19

        int[][] arr3 = {{0, 1, 2, 3, 4, 5},{1, 2, 3, 4, 5, 6},{2, 3, 4, 5, 6, 7},{3, 4, 5, 6, 7, 8}, {4 , 5, 6, 7, 8, 9}, {5 , 6, 7, 8, 9, 9}};//answer should be 55

        System.out.println(HackerRank.hourglassSum(arr1));
        System.out.println(HackerRank.hourglassSum(arr2));
        System.out.println(HackerRank.hourglassSum(arr3));


    }
}
