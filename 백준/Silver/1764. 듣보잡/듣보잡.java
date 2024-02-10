import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
        HashSet<String> people = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        for(int i=0;i<n;i++) {
            people.add(br.readLine());
        }
        for(int i=0;i<m;i++) {
            String s = br.readLine();
            if(people.contains(s)) result.add(s);
        }
        List<String> result2 = new ArrayList<>(result);
        Collections.sort(result2);
        bw.write(Integer.toString(result2.size())+"\n");
        for (String s : result2) {
            bw.write(s+"\n");
        }
        bw.flush(); bw.close();
    }
}