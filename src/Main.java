import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int c = 1;

        while (n>0) {
            int x = n%10;
            a += x;
            n /= 10;
            System.out.print(x+" ");




        }




    }

}




