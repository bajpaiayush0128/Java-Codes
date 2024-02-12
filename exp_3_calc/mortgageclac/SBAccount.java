package mortgageclac;

public class SBAccount extends exp3 {
    String str1 = "NRI", str2 = "Normal";
    String strr;
    double interest;
    int age;

    public SBAccount(String str, double amnt, int agee) {
        strr = str;
        amount = amnt;
        age = agee;
    }

    @Override
    public void calculateInterest() {
        if (str1.equalsIgnoreCase(strr)) {
            if (age > 59) {
                interestRate = 0.12;
                interest = (amount * interestRate) / 4;
                System.out.println("Interest gained: " + interest);
            } else {
                interestRate = 0.06;
                interest = (amount * interestRate) / 4;
                System.out.println("Interest gained: " + interest);
            }

        } else if (str2.equalsIgnoreCase(strr)) {
            if (age > 59) {
                interestRate = 0.08;
                interest = (amount * interestRate) / 4;
                System.out.println("Interest gained: " + interest);
            } else {
                interestRate = 0.04;
                interest = (amount * interestRate) / 4;
                System.out.println("Interest gained: " + interest);
            }

        } else {
            System.out.println("Invalid input");
        }
    }

}