import java.util.Scanner;

public class Solution_120823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // A 방법
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }

        // B방법
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
}