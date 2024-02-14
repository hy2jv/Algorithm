import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] graph;

    static boolean dfs(int x, int y, int m, int n) {
        if(x<=-1 || x>=m || y<=-1 || y >= n) { //범위를 벗어나는 경우
            return false;
        }
        if (Integer.toString(graph[x][y]).equals("1")) { //배추가 심어져 있다면
            graph[x][y] = 0; //방문 처리
            dfs(x-1, y, m, n);
            dfs(x, y-1, m, n);
            dfs(x+1, y, m, n);
            dfs(x, y+1, m, n);
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken()); int n = Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());
            graph = new int[m][n];
            for(int j=0;j<k;j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }
            int result = 0;
            for(int idx1=0; idx1<m; idx1++) {
                for(int idx2=0; idx2<n; idx2++) {
                    if (dfs(idx1, idx2, m, n)) {
                        result += 1;
                    }
                }
            }
            bw.write(Integer.toString(result)+"\n");
        }
        bw.flush(); bw.close();
    }
}