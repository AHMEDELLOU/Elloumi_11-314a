public class Ex2 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };

            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j % 2 == 0) {
                        sum += matrix[i][j];
                    }
                }
            }

            System.out.println("Sum of elements on even columns: " + sum);
        }
    }

