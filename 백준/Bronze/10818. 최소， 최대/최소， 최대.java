import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = -1_000_000;
        int min = 1_000_000;
        for (int i = 0; i < N ; i++){
            int num = sc.nextInt();
            max = (num > max) ? num : max;
            min = (num < min) ? num : min;
        }
        System.out.println(min + " " + max);
    }
}