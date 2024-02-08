import java.io.*;
import java.util.HashMap;

public class Main {
    private static void Hashing(char[] arr) {
        int r = 31; int M = 1234567891;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++) {
            map.put((char)('a'+i),i+1);
        }
        long result = 0L;
        for(int i=0;i<arr.length;i++) {
            result += (long) (map.get(arr[i])*Math.pow(r,i));
        }
        System.out.println(result);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        Hashing(arr);
    }
}