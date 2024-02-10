import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        char y = sc.next().charAt(0);
        System.out.println(test(x,y));
    }
    public static int test(String X, char y){
        char[] z = X.toCharArray();
        int r = 0;
        for (int i = 0; i < z.length; i++) {
            if(z[i] == y){
                r++;
            }
        }
        return r;
    }
}
