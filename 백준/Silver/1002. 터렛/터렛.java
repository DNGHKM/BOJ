import java.util.Scanner;
    public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int bigR = Math.max(r1, r2);
            int smallR = Math.min(r1, r2);
            double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            int radiusSum = (r1+r2);
            if(dis==0) {
                if (r1 == r2) {
                    result=-1;
                } else {
                    result=0;
                }
            } else if(dis>bigR) {
                if(dis <radiusSum){
                    result=2;
                }else if (dis ==radiusSum) {
                    result=1;
                } else {
                    result=0;
                }
            } else {
                if(dis==bigR||dis>bigR-smallR) {
                    result=2;
                } else if(dis==bigR-smallR) {
                    result=1;
                } else{
                    result=0;
                }
            }
            System.out.println(result);
        }
    }
}