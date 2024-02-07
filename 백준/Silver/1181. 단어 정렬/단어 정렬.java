import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];
        List<String> chk = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String tmp = br.readLine();
            if(!chk.contains(tmp)){
                chk.add(tmp);
            }
        }
        Collections.sort(chk);
        chk.sort((s1, s2) -> {
            if (s1.length() !=  s2.length()) {
                return s1.length() - s2.length();
            } return 0;
        });

        for (String s : chk) {
            bw.write(s+"\n");
        }

        bw.flush(); bw.close();

    }
}