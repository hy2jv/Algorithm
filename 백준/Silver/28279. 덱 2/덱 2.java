import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            if (strings[0].equals("1")) {
                int x = Integer.parseInt(strings[1]);
                queue.addFirst(x);
            } else if (strings[0].equals("2")) {
                int x = Integer.parseInt(strings[1]);
                queue.addLast(x);
            } else if (strings[0].equals("3")) {
                if (queue.isEmpty()) bw.write("-1" + "\n");
                else bw.write(Integer.toString(queue.pollFirst()) + "\n");
            } else if (strings[0].equals("4")) {
                if (queue.isEmpty()) bw.write("-1" + "\n");
                else bw.write(Integer.toString(queue.pollLast()) + "\n");
            } else if (strings[0].equals("5")) {
                bw.write(Integer.toString(queue.size()) + "\n");
            } else if (strings[0].equals("6")) {
                if (queue.isEmpty()) bw.write("1" + "\n");
                else bw.write("0" + "\n");
            } else if (strings[0].equals("7")) {
                if (queue.isEmpty()) bw.write("-1" + "\n");
                else bw.write(Integer.toString(queue.peekFirst()) + "\n");
            } else if (strings[0].equals("8")) {
                if (queue.isEmpty()) bw.write("-1" + "\n");
                else bw.write(Integer.toString(queue.peekLast()) + "\n");
            }

        }
        bw.flush();
        bw.close();
    }
}