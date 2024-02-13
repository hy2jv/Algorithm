import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    private static boolean[] visited;
    private static int RESULT = 0;

    static void dfs(int x) {
        visited[x] = true;
        for(int i=0;i<graph.get(x).size();i++) {
            int y = graph.get(x).get(i);
            if(!visited[y]) {
                dfs(y);
                RESULT++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for(int i=0;i<n+1;i++) {
            graph.add(i, new ArrayList<>());
        }
        visited = new boolean[n+1];
        for(int i=0;i<m;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        for (ArrayList<Integer> integers : graph) {
            Collections.sort(integers);
        }
        dfs(1);
        System.out.println(RESULT);
    }
}