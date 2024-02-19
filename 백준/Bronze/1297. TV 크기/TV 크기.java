import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int n = D*D;
        int m = H*H + W*W;
        double result = (double) n /m;
        result = Math.sqrt(result);
        H = (int) Math.floor(H*result);
        W = (int) Math.floor(W*result);
        System.out.println(H+" "+W);
    }
}