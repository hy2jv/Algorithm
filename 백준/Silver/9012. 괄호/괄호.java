import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            char[] chars = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char c : chars) {
                if (!stack.isEmpty() && stack.peek()=='(' && c == ')') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if(stack.size()==0) bw.write("YES"+"\n");
            else bw.write("NO"+"\n");
        }

        bw.flush(); bw.close();
    }
}