import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i][0] = start; arr[i][1] = end;
        }
        //시작 시간과 끝나는 시간 기준 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) { //시작 시간이 같을 경우 끝나는 시간이 빠른 순으로 정렬
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        LinkedList<Integer> endTime = new LinkedList<>();
        endTime.add(arr[0][1]);

        for(int i=1;i<arr.length;i++) {
            if(!endTime.isEmpty()) {
                if(arr[i][1] < endTime.getLast()) {
                    endTime.removeLast();
                    endTime.add(arr[i][1]);
                    continue;
                }
                if(arr[i][0] >= endTime.getLast()) {
                    endTime.add(arr[i][1]);
                }
            }
        }
        System.out.println(endTime.size());
    }
}