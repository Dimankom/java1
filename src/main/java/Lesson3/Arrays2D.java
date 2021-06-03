package Lesson3;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] m = new int[3][];
        for (int i = 0; i < 3; i++) {
            m[i] = new int[i + 2];
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}

