import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 5];

        Arrays.fill(dp, 5001);
        dp[3] = dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
        }

        System.out.println(dp[n] > 5000 ? -1 : dp[n]);
    }
}