import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static int[] visited = new int[1001];
    private static int[][] graph = new int[1001][1001];

    static void dfs(int x) {
        if(visited[x] == 1) return;
        visited[x] = 1;
        for(int i=1; i<graph.length;i++) {
            if(graph[x][i] == 1) {
                dfs(i);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        int result = 0;
        for(int i=1;i<=n;i++) {
            if(visited[i] == 0) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }
}