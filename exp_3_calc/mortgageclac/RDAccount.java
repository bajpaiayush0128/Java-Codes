package mortgageclac;

public class RDAccount extends exp3 {
    int noOfMonths;
    int ageOfACHolder;
    double interest;

    public RDAccount(int months, double amnt, int agee) {
        noOfMonths = months;
        amount = amnt;
        ageOfACHolder = agee;
    }

    public void calculateInterest() {
        if (ageOfACHolder < 60) {
            if (noOfMonths <= 6 && noOfMonths > 0) {
                interestRate = 0.075;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 9 && noOfMonths > 6) {
                interestRate = 0.0775;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 12 && noOfMonths > 9) {
                interestRate = 0.08;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 15 && noOfMonths > 12) {
                interestRate = 0.0825;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 18 && noOfMonths > 15) {
                interestRate = 0.085;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths > 18) {
                interestRate = 0.0875;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else {
                System.out.println("Invalid maturity period");
            }
        } else {
            if (noOfMonths <= 6 && noOfMonths > 0) {
                interestRate = 0.08;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);

            } else if (noOfMonths <= 9 && noOfMonths > 6) {
                interestRate = 0.0825;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 12 && noOfMonths > 9) {
                interestRate = 0.085;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 15 && noOfMonths > 12) {
                interestRate = 0.0875;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths <= 18 && noOfMonths > 15) {
                interestRate = 0.09;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else if (noOfMonths > 18) {
                interestRate = 0.0925;
                interest = (amount * interestRate * noOfMonths) / 12;
                System.out.println("Interest gained: " + interest);
            } else {
                System.out.println("Invalid maturity period");
            }
        }
    }

}
