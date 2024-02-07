import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static char[][] chess = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };
    public static int chk(char[][] arr, int x, int y) {
        int cnt = 0;
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if (chess[i][j] == arr[x+i][y+j]) {
                    cnt++;
                }
            }
        }
        return Math.min(cnt, 64-cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        for(int i=0;i<n;i++) {
            board[i] = br.readLine().toCharArray();
        }
        int result = 64;
        for(int i=0;i<n-7;i++) {
            for(int j=0;j<m-7;j++) {
                result = Math.min(result, chk(board, i,j));
            }
        }
        System.out.println(result);
    }
}