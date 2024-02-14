import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            int x =Integer.parseInt(br.readLine());
            if(Integer.toString(x).equals("0")) {
                if(queue.isEmpty()) bw.write("0"+"\n");
                else bw.write(queue.poll()+"\n");
            }
            else {
                queue.add(x);
            }
        }
        bw.flush(); bw.close();
    }
}