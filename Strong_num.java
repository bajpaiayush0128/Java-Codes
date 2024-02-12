import java.util.*;

public class Strong_num {
    public static void main(String[] args) {
        int n, i;
        int fact, x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the number : ");
            n = sc.nextInt();
        }
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            i = 1;
            fact = 1;
            x = temp % 10;
            while (i <= x) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println("It is a strong number\n");
        else
            System.out.println("It is not a strong number\n");
        System.out.println();
    }
}