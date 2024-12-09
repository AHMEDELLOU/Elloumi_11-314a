import java.util.HashMap;
public class Ex4{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2, 1},
                {7, 8, 9},
                {4, 4, 5}
        };

        int[][] result = deleteRowsWithoutDuplicates(matrix);
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] deleteRowsWithoutDuplicates(int[][] matrix) {
        return java.util.Arrays.stream(matrix)
                .filter(row -> hasDuplicates(row))
                .toArray(int[][]::new);
    }

    private static boolean hasDuplicates(int[] row) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : row) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap.values().stream().anyMatch(count -> count > 1);
    }
}
