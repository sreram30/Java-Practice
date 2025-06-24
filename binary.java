import java.util.Scanner;

public class binary {
    int binary(int n, int ar[], int k) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (ar[mid] == k) {
                return mid;
            } else if (ar[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        binary a = new binary();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        int k = s.nextInt();
        s.nextLine();
        int result = a.binary(n, ar, k);

        if (result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index " + result);
        }
    }
}

