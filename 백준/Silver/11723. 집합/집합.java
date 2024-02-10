import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String comm = st.nextToken();
            if(comm.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                stack.add(x);
            } else if (comm.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                if(stack.contains(x)) {
                    stack.remove(stack.indexOf(x));
                }
            } else if (comm.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if(stack.contains(x)) bw.write("1"+"\n");
                else bw.write("0"+"\n");
            } else if (comm.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                if (stack.contains(x)) {
                    stack.remove(stack.indexOf(x));
                } else {
                    stack.add(x);
                }
            } else if(comm.equals("all")) {
                stack.removeAllElements();
                for(int x=1;x<=20;x++) {
                    stack.add(x);
                }
            } else if (comm.equals("empty")) {
                stack.removeAllElements();
            }
        }
        bw.flush(); bw.close();

    }
}