import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean chk = false;
        int result = 0;
        for(int i=1;i<n;i++) {
            int sum = i; result = i;
            int tmp = i;
            while (tmp>0) {
                sum += tmp%10;
                tmp/=10;
            }
            if (sum==n) {
                chk = true;
                break;
            }
        }
        if (chk) System.out.println(result);
        else System.out.println(0);
    }
}