import java.util.Arrays;
import java.util.Scanner;

public class distinctelement {
    static void distinct(int ar[], int n) {
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    visited[j] = true;
                }
            }
            count++;
        }

        System.out.println("Number of distinct elements: " + count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        distinct(ar, n);
    }
}
