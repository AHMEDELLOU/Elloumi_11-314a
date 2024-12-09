public class Ex3 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] transposedMatrix = transpose(matrix);

            for (int[] row : transposedMatrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }

        public static int[][] transpose(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] transposed = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposed[j][i] = matrix[i][j];
                }
            }
            return transposed;
        }
    }

