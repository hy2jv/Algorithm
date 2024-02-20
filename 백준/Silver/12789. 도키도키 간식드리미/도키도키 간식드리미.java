import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int start = 1;

        for(int i = 0; i < N; i++){
            int num = scanner.nextInt();
            stack.push(num);

            while(!stack.empty()){
                if(stack.peek() == start){
                    stack.pop();
                    start++;
                }
                else{
                    break;
                }
            }
        }

        if(stack.empty()){
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }
    }
}