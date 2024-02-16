import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0;i<n;i++) {
            char[] chars = br.readLine().toCharArray();
            LinkedList<Character> chkChar = new LinkedList<>();
            char chk = chars[0];
            chkChar.add(chk);
            boolean groupchk = true;
            for(int j=1;j<chars.length;j++) {
                chk = chars[j-1];
                if(!chkChar.contains(chars[j]) && chk != chars[j]) {
                    chkChar.add(chars[j]);
                } else if(chkChar.contains(chars[j]) && chk != chars[j]) {
                    groupchk = false;
                    break;
                }
            }
            if (groupchk) result++;
        }
        System.out.println(result);
    }
}