import java.io.*;
import java.util.*;

public class Main {
    static int index;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hole = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        index = 0;
        int count = 0;
        while (index < arr.length) {
            int tmp = arr[index];
            if (list.contains(tmp)) {
                index++;
                continue;
            }else if(list.size()<hole){
                list.add(tmp);
            }else {
                list.remove(minIndex(list));
                count++;
                list.add(tmp);
            }
            index++;
        }
        System.out.println(count);
    }

    private static int minIndex(ArrayList<Integer> list) {
        int[] indexArr = new int[list.size()];
        Arrays.fill(indexArr,101);
        for (int i = 0; i <list.size(); i++) {
            for (int j = index; j <arr.length; j++) {
                if(list.get(i)==arr[j]){
                    indexArr[i] = j;
                    break;
                }
            }
        }
        int indexNum = 0;
        int max = 0;
        for (int i = 0; i <indexArr.length; i++) {
            if(indexArr[i]>max) {
                max = indexArr[i];
                indexNum = i;
            }
        }
        return indexNum;
    }
}