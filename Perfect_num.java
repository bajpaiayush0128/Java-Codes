import java.util.Scanner;

public class Perfect_num {
    public static void main(String[] args) {
        int num, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            num = sc.nextInt();
        }

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum = sum + i;
        }
        if (sum == num)
            System.out.println("\nIt is a Perfect Number.");
        else
            System.out.println("\nIt is not a Perfect Number.");

    }
}