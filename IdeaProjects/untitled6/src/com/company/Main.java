import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n <= 0) break;
            int[] a = new int[n * n];
            int j = 0;
            while (j < a.length) {
                int r = j / n;
                int c = j % n;
                int l = 0;
                while (r > l && r < n - l - 1 && c > l && c < n - l - 1) {
                    l++;
                }
                a[j] = l + 1;
                j++;
            }
            j = 0;
            while (j < a.length) {
                System.out.print("  ");
                System.out.print(a[j]);
                if ((j + 1) % n == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
        }
    }
}