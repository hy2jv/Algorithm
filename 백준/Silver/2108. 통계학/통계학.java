import java.io.*;
import java.util.*;

public class Main {
    private static double avg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum/arr.length;
    }

    private static int middle(int[] arr) {
        Arrays.sort(arr);
        int idx = arr.length/2;
        return arr[idx];
    }

    private static int modeValue(int[] arr) {
        LinkedHashMap<Integer, Integer> dict = new LinkedHashMap<>();
        for (int i : arr) {
            if(!dict.containsKey(i)) {
                dict.put(i, 1);
            } else {
                dict.put(i, dict.get(i)+1);
            }
        }
        int max = -1;
        for (Integer value : dict.values()) {
            if (value>max) max = value;
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
            if (entry.getValue()==max) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        if(result.size()>1) return result.get(1);
        else return result.get(0);
    }

    private static int range(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.printf("%d\n%d\n%d\n%d",Math.round(avg(arr)), middle(arr), modeValue(arr), range(arr));
    }
}