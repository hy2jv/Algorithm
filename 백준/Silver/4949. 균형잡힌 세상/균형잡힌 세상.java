import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            if(s.equals(".")) break;
            for(int i=0;i<s.length();i++) {
                char tmp = s.charAt(i);
                if(tmp=='('||tmp=='[') {
                    stack.push(tmp);
                }else if(tmp==')' && !stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                } else if (tmp==']' && !stack.isEmpty() && stack.peek()=='[') {
                    stack.pop();
                } else if (tmp==')' || tmp==']') {
                    stack.push(tmp);
                }

            }
            if(stack.isEmpty()) bw.write("yes"+"\n");
            else bw.write("no"+"\n");
        }
        bw.flush(); bw.close();
    }
}