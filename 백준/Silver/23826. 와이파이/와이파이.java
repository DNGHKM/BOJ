import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Wifi publicWifi = new Wifi(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        List<Wifi> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Wifi wifi = new Wifi(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            wifi.publicE += publicWifi.e - getDist(wifi, publicWifi);
            list.add(wifi);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                Wifi wifi1 = list.get(i);
                Wifi wifi2 = list.get(j);
                wifi1.publicE -= Math.max(0, wifi2.e - getDist(wifi1, wifi2));
            }
        }
        int max = -1;
        for (Wifi wifi : list) {
            max = Math.max(max, wifi.publicE);
        }
        if (max < 1) {
            System.out.println("IMPOSSIBLE");
            return;
        }
        System.out.println(max);
    }

    private static int getDist(Wifi wifi1, Wifi wifi2) {
        return Math.abs(wifi1.x - wifi2.x) + Math.abs(wifi1.y - wifi2.y);
    }

    private static class Wifi {
        int x;
        int y;
        int e;
        int publicE;

        public Wifi(int x, int y, int e) {
            this.x = x;
            this.y = y;
            this.e = e;
        }
    }
}
