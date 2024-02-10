import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] arr = new long[101];
        arr[0] = arr[1] = arr[2] = 1; arr[3] = 2; arr[4] = 2;
        for(int i=5;i<101;i++) {
            arr[i] = arr[i-2]+arr[i-3];
        }
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int x = Integer.parseInt(br.readLine());
            bw.write(Long.toString(arr[x-1])+"\n");
        }
        bw.flush(); bw.close();

    }
}