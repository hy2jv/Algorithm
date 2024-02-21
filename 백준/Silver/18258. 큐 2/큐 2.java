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
            if (strings[0].equals("push")) {
                int x = Integer.parseInt(strings[1]);
                queue.add(x);
            } else if (strings[0].equals("pop")) {
                if(queue.isEmpty()) bw.write("-1"+"\n");
                else bw.write(Integer.toString(queue.removeFirst())+"\n");
            } else if (strings[0].equals("size")) {
                bw.write(Integer.toString(queue.size())+"\n");
            } else if (strings[0].equals("empty")) {
                if (queue.isEmpty()) bw.write("1"+"\n");
                else bw.write("0"+"\n");
            } else if(strings[0].equals("front")) {
                if(queue.isEmpty()) bw.write("-1"+"\n");
                else bw.write(Integer.toString(queue.peekFirst())+"\n");
            } else if(strings[0].equals("back")) {
                if(queue.isEmpty()) bw.write("-1"+"\n");
                else bw.write(Integer.toString(queue.peekLast())+"\n");
            }
        } bw.flush(); bw.close();
    }
}