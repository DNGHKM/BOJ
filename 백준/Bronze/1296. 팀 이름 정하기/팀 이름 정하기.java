import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static int[] nameArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        nameArr = new int[4];
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            switch (c) {
                case 'L':
                    nameArr[0]++;
                    break;
                case 'O':
                    nameArr[1]++;
                    break;
                case 'V':
                    nameArr[2]++;
                    break;
                case 'E':
                    nameArr[3]++;
                    break;
            }
        }
        int n = Integer.parseInt(br.readLine());
        ArrayList<Team> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            Team team = new Team(input);
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                switch (c) {
                    case 'L':
                        team.l++;
                        break;
                    case 'O':
                        team.o++;
                        break;
                    case 'V':
                        team.v++;
                        break;
                    case 'E':
                        team.e++;
                        break;
                }
            }
            list.add(team);
        }
        for (Team team : list) {
            team.point = setPoint(team);
        }
        list.sort(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                if(o1.point>o2.point){
                    return -1;
                }else if(o1.point<o2.point){
                    return 1;
                }else{
                    return o1.name.compareTo(o2.name);
                }
            }
        });
        System.out.println(list.get(0).name);
    }
    private static long setPoint(Team team) {
        int l = team.l + nameArr[0];
        int o = team.o + nameArr[1];
        int v = team.v + nameArr[2];
        int e = team.e + nameArr[3];
        return ((long) (l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
    }
}
class Team {
    public Team(String name) {
        this.name = name;
    }
    String name;
    int l;
    int o;
    int v;
    int e;
    long point;
}