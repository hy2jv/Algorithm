import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, n, a, b, i;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(); n = sc.nextInt();
        for(i=0;i<n;i++) {
            a = sc.nextInt(); b = sc.nextInt();
            total += (a*b);
        }
        String result = (total == x) ? "Yes" : "No";
        System.out.println(result);
    }
}