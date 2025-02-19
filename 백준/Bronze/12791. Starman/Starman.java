import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[25][2];
        String s = "1967 DavidBowie\n" +
                "1969 SpaceOddity\n" +
                "1970 TheManWhoSoldTheWorld\n" +
                "1971 HunkyDory\n" +
                "1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars\n" +
                "1973 AladdinSane\n" +
                "1973 PinUps\n" +
                "1974 DiamondDogs\n" +
                "1975 YoungAmericans\n" +
                "1976 StationToStation\n" +
                "1977 Low\n" +
                "1977 Heroes\n" +
                "1979 Lodger\n" +
                "1980 ScaryMonstersAndSuperCreeps\n" +
                "1983 LetsDance\n" +
                "1984 Tonight\n" +
                "1987 NeverLetMeDown\n" +
                "1993 BlackTieWhiteNoise\n" +
                "1995 1.Outside\n" +
                "1997 Earthling\n" +
                "1999 Hours\n" +
                "2002 Heathen\n" +
                "2003 Reality\n" +
                "2013 TheNextDay\n" +
                "2016 BlackStar";
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = st.nextToken();
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringBuilder sb2 = new StringBuilder();
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cnt = 0;
            for (String[] album : arr) {
                if (start <= Integer.parseInt(album[0]) && Integer.parseInt(album[0]) <= end) {
                    cnt++;
                    sb2.append(album[0] + " " + album[1] + "\n");
                }
            }
            sb.append(cnt + "\n");
            sb.append(sb2);
        }
        System.out.println(sb);
    }
}