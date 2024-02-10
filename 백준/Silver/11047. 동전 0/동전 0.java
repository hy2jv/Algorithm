import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int idx = 0;
        for(int i=0;i<n;i++) {
            coin[i] = Integer.parseInt(br.readLine());
            if(coin[i]<=k) idx++;
        }
        int result = 0;
        for(int i=idx-1;i>=0;i--) {
            if(k/coin[i]>=0) {
                result += k/coin[i];
                k%=coin[i];
            }
        }
        System.out.println(result);
    }
}