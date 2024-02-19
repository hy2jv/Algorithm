import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        for(int x=-999;x<1000;x++) {
            for(int y=-999;y<1000;y++) {
                int result1 = a*x + b*y;
                int result2 = d*x + e*y;
                if(Integer.toString(result1).equals(Integer.toString(c))
                        && Integer.toString(result2).equals(Integer.toString(f))) {
                    System.out.println(x+" "+y);
                    break;
                }
            }
        }
    }
}