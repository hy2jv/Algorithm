import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (Integer.toString(a).equals("0") && Integer.toString(b).equals("0")) break;
            if (a > b) bw.write("Yes" + "\n");
            else bw.write("No" + "\n");
        }
        bw.flush();
        bw.close();
    }
}