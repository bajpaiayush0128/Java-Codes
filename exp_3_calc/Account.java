import java.util.*;

import mortgageclac.FDAccount;
import mortgageclac.RDAccount;
import mortgageclac.SBAccount;

public class Account {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int flag = 0, age;
            double pamnt;

            while (true) {
                System.out.println("=============================");
                System.out.println("            Menu             ");
                System.out.println("=============================");

                System.out.println("1. Interest calculator-SB\n2. Interest calculator-FD\n3. Interest calculator-RD");

                if (flag == 1)
                    System.out.println("4. Quit the Program");

                System.out.println("Enter your choice");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter your Principal Amount: ");
                        pamnt = sc.nextDouble();
                        System.out.println("Are you NRI or NORMAL: ");
                        sc.nextLine();
                        String str = sc.nextLine();
                        System.out.println("What is ur age: ");
                        age = sc.nextInt();
                        SBAccount sb = new SBAccount(str, pamnt, age);
                        sb.calculateInterest();

                        break;

                    case 2:
                        System.out.println("Enter your Principal Amount: ");
                        pamnt = sc.nextDouble();
                        System.out.println("Enter your maturity period in days ");
                        int mdays = sc.nextInt();
                        System.out.println("What is ur age: ");
                        age = sc.nextInt();
                        FDAccount fd = new FDAccount(mdays, pamnt, age);
                        fd.calculateInterest();
                        break;

                    case 3:
                        System.out.println("Enter your Principal Amount: ");
                        pamnt = sc.nextDouble();
                        System.out.println("Enter your maturity period in months: ");
                        // sc.nextInt();
                        int mMonths = sc.nextInt();
                        System.out.println("What is ur age: ");
                        age = sc.nextInt();
                        RDAccount rd = new RDAccount(mMonths, pamnt, age);
                        rd.calculateInterest();
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Input");
                }

                flag = 1;
            }
        }

    }
}