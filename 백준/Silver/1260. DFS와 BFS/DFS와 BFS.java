import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    private static boolean[] visited;

    static void dfs(int x) {
        visited[x] = true; //현재 노드 방문 처리
        System.out.print(x + " ");
        for(int i=0;i< graph.get(x).size();i++) { //현재 노드와 연결된 다른 노드를 재귀적으로 방문
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true; //현재 노드 방문 처리
        while(!queue.isEmpty()) { //큐가 빌 때까지 반복
            int x = queue.poll(); //큐에서 하나의 원소를 뽑아
            System.out.print(x + " "); //출력
            for(int i=0;i<graph.get(x).size();i++) { //해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
                int y = graph.get(x).get(i);
                if(!visited[y]) {
                    queue.add(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //정점의 개수
        int m = Integer.parseInt(st.nextToken()); //간선의 개수
        int v = Integer.parseInt(st.nextToken()); //정점의 번호

        visited = new boolean[n+1];
        for(int i=0;i<n+1;i++) {
            graph.add(i, new ArrayList<>());
        }

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        // 각 노드의 인접 리스트를 정렬
        for (ArrayList<Integer> neighbors : graph) {
            Collections.sort(neighbors);
        }

        dfs(v);
        System.out.println();
        visited = new boolean[n+1]; //방문 초기화
        bfs(v);
    }
}