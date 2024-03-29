import java.io.*;
import java.util.*;

public class Main {
    static int M, N;
    static int[][] arr;
    static final int[] DX = {-1, 1, 0, 0};
    static final int[] DY = {0, 0, -1, 1};
    static Queue<Position> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    queue.add(new Position(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Position pos = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = pos.x + DX[i];
                int ny = pos.y + DY[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                if (arr[nx][ny] == -1) {
                    continue;
                }
                if (arr[nx][ny] == 0) {
                    arr[nx][ny] = arr[pos.x][pos.y] + 1;
                    queue.add(new Position(nx, ny));
                }
            }
        }

        System.out.println(getResult());
    }

    static int getResult() {
        int result = 0;
        outer: for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    return -1;
                }
                result = Math.max(result, arr[i][j]);
            }
        }
        return result - 1;
    }
}

class Position {
    int x, y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}