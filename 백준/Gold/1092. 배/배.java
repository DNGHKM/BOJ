import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> cranes = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cranes.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> boxes = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            boxes.add(Integer.parseInt(st.nextToken()));
        }

        cranes.sort(Collections.reverseOrder());
        boxes.sort(Collections.reverseOrder());

        int time = 0;
        if(cranes.get(0)<boxes.get(0)){
            System.out.println(-1);
            return;
        }
        while(!boxes.isEmpty()){
            int boxIndex = 0;
            for (int i =0; i<cranes.size();) {
                if (cranes.get(i) >= boxes.get(boxIndex)) {
                    boxes.remove(boxIndex);
                    i++;
                    if(boxes.isEmpty()){
                        break;
                    }
                } else{
                    boxIndex++;
                }
                if(boxIndex==boxes.size()){
                    break;
                }
            }
            while(true){
                if(!boxes.isEmpty()&&!cranes.isEmpty()&&cranes.get(0)<boxes.get(0)){
                    cranes.remove(0);
                }else{
                    break;
                }
            }
            time++;
        }
        System.out.print(time);
    }
}