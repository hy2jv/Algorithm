import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Integer[] dp = new Integer[n+1];
        dp[0] = arr[0]; dp[1] = arr[1];
        if(n>=2) {
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(find(dp, arr, n));
    }

    static int find(Integer[] dp, int[] arr, int n) {
        if(dp[n] == null) {
            dp[n] = Math.max(find(dp, arr, n-2), find(dp, arr, n-3) + arr[n-1]) + arr[n];
        }
        return dp[n];
    }
}