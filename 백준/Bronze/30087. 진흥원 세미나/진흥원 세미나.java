import java.util.Scanner;
public class Main { //30087번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] roomNum = new String[n];
        for (int i = 0; i < n; i++) {
            String seminar = sc.next();
            if (seminar.equals("Algorithm")) {
                roomNum[i] = "204";
            } else if (seminar.equals("DataAnalysis")) {
                roomNum[i] = "207";
            } else if (seminar.equals("ArtificialIntelligence")) {
                roomNum[i] = "302";
            } else if (seminar.equals("CyberSecurity")) {
                roomNum[i] = "B101";
            } else if (seminar.equals("Network")) {
                roomNum[i] = "303";
            } else if (seminar.equals("Startup")) {
                roomNum[i] = "501";
            } else if (seminar.equals("TestStrategy")) {
                roomNum[i] = "105";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(roomNum[i]);
        }
    }
}