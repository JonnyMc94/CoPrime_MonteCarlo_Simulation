import java.util.*;


public class CoPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        Random rand = new Random();
        double count = 0.0;
        double monte = 1000000.0;

        for(int i = 0; i<monte; i++) {
            int rand1 = (rand.nextInt(10000)*x);
            int rand2 = (rand.nextInt(10000)*y);
            int res = recursiveGCD(rand1, rand2);

            if(res == 1) {
                count++;
            }
        }
        double finalCount = (count/monte)*100;
        int finalPercent = (int)Math.round(finalCount);

        System.out.println(finalPercent);
    }
    static int recursiveGCD(int a, int b ) {
        if(b==0) {
            return a;
        }
        return recursiveGCD(b, a%b);

    }

}

