import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int min = 256; int max = 0;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max) max = arr[i][j];
                if(arr[i][j]<min) min = arr[i][j];
            }
        }

        int min_time = 1000000000;
        int max_height = 0;
        Loop1:
        for(int height = min; height <= max; height++) {
            int del_cnt = 0; int ins_cnt = 0; int tmp_b = b;
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(arr[i][j]<height) {
                        ins_cnt += height - arr[i][j];
                        tmp_b -= height - arr[i][j];
                    } else if (arr[i][j] > height) {
                        del_cnt += arr[i][j] - height;
                        tmp_b += arr[i][j] - height;
                    }
                }
            }
            if (tmp_b<0) {
                continue Loop1;
            }
            int time = del_cnt * 2 + ins_cnt;
            if(time <= min_time && height >= max_height) {
                min_time = time;
                max_height = height;
            }
        }
        System.out.println(min_time + " " + max_height);
    }
}