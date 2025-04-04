import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int T;
    static int h, l;
    static int[][] parkingBuilding = new int[50][50];
    static int[] curPos = new int[50];
    static Map<Integer, int[]> carMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());

            carMap.clear();

            for (int i = 0; i < h; i++) {
                curPos[i] = 0;
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < l; j++) {
                    int car = Integer.parseInt(st.nextToken());
                    parkingBuilding[i][j] = car;
                    if (car != -1) {
                        carMap.put(car, new int[]{i, j});
                    }
                }
            }

            sb.append(solution()).append("\n");
        }

        System.out.print(sb);
    }

    static int solution() {
        int answer = 0;
        List<Integer> cars = new ArrayList<>(carMap.keySet());
        Collections.sort(cars);

        for (int carNum : cars) {
            int[] pos = carMap.get(carNum);
            int floor = pos[0];
            int rawIdx = pos[1];
            int rotatedIdx = (rawIdx - curPos[floor] + l) % l;
            int rotate = Math.min(rotatedIdx, l - rotatedIdx);
            answer += floor * 2 * 10;
            answer += rotate * 5;
            
            curPos[floor] = (curPos[floor] + rotatedIdx) % l;
        }

        return answer;
    }
}
