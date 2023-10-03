import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dnaLength = sc.nextInt();
        int partLength = sc.nextInt();
        String input = sc.next();
        char[] inputCharArray = input.toCharArray();
        int[] checkArr = new int[4];
        int[] currentArr = new int[4];
        int point =0;
        int count = 0;
        int start = 0;
        int finish = partLength-1;
        for (int i = 0; i <4; i++) {
            checkArr[i] = sc.nextInt();
        }
        for (int i = 0; i <partLength; i++) {
            if(inputCharArray[i]=='A'){
                currentArr[0]++;
            } else if (inputCharArray[i]=='C') {
                currentArr[1]++;
            } else if (inputCharArray[i]=='G') {
                currentArr[2]++;
            } else if (inputCharArray[i]=='T') {
                currentArr[3]++;
            }
        }
        while(finish<=dnaLength-1) {
            for (int i = 0; i < 4; i++) {
                if (currentArr[i] >= checkArr[i]) {
                    point++;
                }
            }
            if (point == 4) {
                count++;
            }
            point=0;
            if(inputCharArray[start]=='A'){
                currentArr[0]--;
            } else if (inputCharArray[start]=='C') {
                currentArr[1]--;
            } else if (inputCharArray[start]=='G') {
                currentArr[2]--;
            } else if (inputCharArray[start]=='T') {
                currentArr[3]--;
            }
            start++;
            finish++;
            if(finish==dnaLength){
                break;
            }
            if(inputCharArray[finish]=='A'){
                currentArr[0]++;
            } else if (inputCharArray[finish]=='C') {
                currentArr[1]++;
            } else if (inputCharArray[finish]=='G') {
                currentArr[2]++;
            } else if (inputCharArray[finish]=='T') {
                currentArr[3]++;
            }
        }
        System.out.println(count);
    }
}