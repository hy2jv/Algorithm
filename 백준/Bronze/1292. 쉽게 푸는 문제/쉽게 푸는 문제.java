import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[1000000];
        int idx = 0;
        for(int i=1;i<=1000;i++) {
            for(int j=0;j<i;j++) {
                arr[idx] = i;
                idx++;
            }
        }
        int result = 0;
        for(int i=a-1;i<b;i++) {
            result+= arr[i];
        }
        System.out.println(result);
    }
}