import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (n1, n2) -> {
            if(!Integer.toString(n1[1]).equals(Integer.toString(n2[1]))) return n1[1] - n2[1];
            else return n1[0] - n2[0];
        });
        for (int[] ints : arr) {
            System.out.println(ints[0]+" "+ints[1]);
        }
    }
}