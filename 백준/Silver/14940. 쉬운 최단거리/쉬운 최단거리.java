import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class info {
    int x;
    int y;
    int move;
    info(int x, int y, int move) {
        this.x = x;
        this.y = y;
        this.move = move;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int[][] route = new int[N][M];

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                route[i][j] = -1;
            }
        }
        boolean[][] visited = new boolean[N][M];
        Queue<info> queue = new LinkedList<>();
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2) {
                    visited[i][j] = true;
                    route[i][j] = 0;
                    queue.add(new info(i, j, 0));
                }
            }
        }

        while(!queue.isEmpty()) {
            info info = queue.remove();
            int x = info.x;
            int y = info.y;
            int move = info.move;
            route[x][y] = move;

            for(int i=0;i<4;i++) {
                int xTo = x + dx[i];
                int yTo = y + dy[i];

                if(xTo<0 || yTo< 0 || xTo >=N || yTo >= M) continue;
                if(visited[xTo][yTo] || map[xTo][yTo]==0) continue;
                visited[xTo][yTo] = true;

                queue.add(new info(xTo, yTo, (move+1)));
            }
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(map[i][j] ==0) route[i][j] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                sb.append(route[i][j] + " ");
            } sb.append("\n");
        }
        System.out.println(sb);
    }
}