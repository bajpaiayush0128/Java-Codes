import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, temp, digits = 0, finalNum = 0, x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number to be checked: ");
            num = sc.nextInt();
        }

        temp = num;
        while (num > 0) {
            num = num / 10;
            digits++;
        }

        for (num = temp; num > 0; num /= 10) {
            x = num % 10;
            finalNum = finalNum + (int) Math.pow(x, digits);
        }

        if (finalNum == temp)
            System.out.println("\nArmstrong Number");
        else
            System.out.println("\nNot an Armstrong Number.");
    }
}