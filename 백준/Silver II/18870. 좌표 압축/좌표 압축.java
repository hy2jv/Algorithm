import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Integer[] arr2 = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x; arr2[i] = x;
        }
        Arrays.sort(arr2);
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int i=0;i<n;i++) {
            if(!map.containsKey(arr2[i])) {
                map.put(arr2[i], idx++);
            }
        }
        for(int i=0;i<n;i++) {
            bw.write(map.get(arr[i])+" ");
        }
        bw.flush(); bw.close();

    }
}