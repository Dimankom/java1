package Lesson3;

import java.util.Scanner;

public class Romb {
    public static void solution() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] m = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = '.';

            }

        }
        int left = n / 2, right = n / 2 + 1;
        for (int i = 0; i <= n / 2; i++) {
            for (int j = left; j < right; j++) {
                m[i][j] = '*';
            }
            left--;
            right++;
        }
        left++;
        right--;
        for (int i = n / 2 + 1; i < n; i++) {
            left++;
            right--;
            for (int j = left; j < right; j++) {
                m[i][j] = '*';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        solution();
    }
}
