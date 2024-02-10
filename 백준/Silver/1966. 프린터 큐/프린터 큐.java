import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            Queue<Integer> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if(Integer.toString(j).equals(Integer.toString(m))) {
                    queue.add(10);
                } else queue.add(arr[j]);
            }
            int key = arr[m];
            Arrays.sort(arr);

            int idx = n-1;
            int print = 1;
            while (true) {
                int tmp = queue.peek();
                if(!Integer.toString(arr[idx]).equals(Integer.toString(tmp))) {
                    if(Integer.toString(arr[idx]).equals(Integer.toString(key))&& Integer.toString(tmp).equals(Integer.toString(10))) {
                        bw.write(Integer.toString(print)+"\n");
                        break;
                    } else {
                        int x = queue.remove();
                        queue.add(x);
                    }
                } else {
                    print++;
                    queue.remove();
                    idx--;
                }
            }
        }
        bw.flush(); bw.close();
    }
}