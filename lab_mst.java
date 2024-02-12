// fibonacci and armstrong with menu driven
import java.util.Scanner;

class Fib {
    int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}

class Arm {
    boolean armstrong(int n) {
        int orgno, remainder, result = 0;

        orgno = n;

        while (orgno != 0) {
            remainder = orgno % 10;
            result += Math.pow(remainder, 3);
            orgno /= 10;
        }

        if (result == n)
            return true;
        else
            return false;
    }
}

public class lab_mst {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 1 if want fibonacci series and 2 if you want to check armstrong number ");
        choice = sc.nextInt();

        Fib x = new Fib();
        Arm y = new Arm();

        switch (choice) {
            case 1:
                System.out.println("Enter the no.: ");
                int n = sc.nextInt();
                int result = 0;
                for (int i = 1; i <= n; i++) {
                    result = x.fib(i);
                    System.out.print(" " + result);
                }
                break;

            case 2:
                System.out.println("Enter the no.: ");
                int a = sc.nextInt();
                boolean resul = y.armstrong(a);
                if (resul == true)
                    System.out.println(a + " is an Armstrong number.");
                else
                    System.out.println(a + " is not an Armstrong number.");

            default:
                break;
        }
        sc.close();

    }
}