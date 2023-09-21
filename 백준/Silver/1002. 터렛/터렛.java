import java.util.Scanner;
    public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int bigRadius = Math.max(r1, r2);
            int smallRadius = Math.min(r1, r2);
            double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            int radiusSum = (r1+r2);
            if(distance==0) {
                //두 원의 중심이 일치할 때
                if (r1 == r2) {
                    arr[i]=-1;
                } else {
                    arr[i]=0;
                }
            } else if(distance>bigRadius) {
                //두 원이 서로 떨어져 있을 때
                if(distance <radiusSum){
                    arr[i]=2;
                }else if (distance ==radiusSum) {
                    arr[i]=1;
                } else {
                    arr[i]=0;
                }
            } else if(distance<=bigRadius) {
                //큰 원 안에 작은 원이 있을 때
                if(distance==bigRadius||distance>bigRadius-smallRadius) {
                    //두 점의 거리와 큰 원의 반지름이 같을 때
                    arr[i]=2;
                } else if(distance==bigRadius-smallRadius) {
                    //두 점의 거리 == 큰 반지름-작은 반지름(내접)
                    arr[i]=1;
                } else{
                    arr[i]=0;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}