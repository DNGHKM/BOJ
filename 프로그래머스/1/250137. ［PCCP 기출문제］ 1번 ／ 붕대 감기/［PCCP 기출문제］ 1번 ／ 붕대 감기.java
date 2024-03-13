class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int bandTime = 0;
        int hp = health;
        while (time <= attacks[attacks.length - 1][0]) {
            for (int i = 0; i < attacks.length; i++) {
                if (time == attacks[i][0]) {
                    bandTime = 0;
                    hp -= attacks[i][1];
                    if (hp <= 0) {
                        return(-1);
                    } else if(i== attacks.length-1) {
                        return(hp);
                    }
                    time++;
                }
            }
            if (time > attacks[attacks.length - 1][0]) break;
            bandTime++;
            if (hp < health) {
                if (bandTime == bandage[0]) {
                    hp += bandage[2];
                    bandTime = 0;
                }
                hp += bandage[1];
                if (hp >= health) {
                    hp = health;
                }
                time++;
                continue;
            }
            time++;
        }
        return(hp);
    }
}