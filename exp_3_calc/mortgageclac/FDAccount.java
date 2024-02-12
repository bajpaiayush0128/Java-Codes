package mortgageclac;

public class FDAccount extends exp3 {
    int noOfDays;
    int ageOfACHolder;
    double interest;

    public FDAccount(int days, double amnt, int agee) {
        noOfDays = days;
        amount = amnt;
        ageOfACHolder = agee;
    }

    public void calculateInterest() {
        if (amount < 10000000) {
            if (ageOfACHolder < 60) {
                if (noOfDays <= 14 && noOfDays >= 7) {
                    interestRate = 0.045;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);

                } else if (noOfDays <= 29 && noOfDays >= 15) {
                    interestRate = 0.0475;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 45 && noOfDays >= 30) {
                    interestRate = 0.055;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 60 && noOfDays > 45) {
                    interestRate = 0.07;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 184 && noOfDays >= 61) {
                    interestRate = 0.075;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 365 && noOfDays >= 185) {
                    interestRate = 0.08;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else {
                    System.out.println("Invalid maturity period");
                }
            } else {
                if (noOfDays <= 14 && noOfDays >= 7) {
                    interestRate = 0.05;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);

                } else if (noOfDays <= 29 && noOfDays >= 15) {
                    interestRate = 0.0525;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 45 && noOfDays >= 30) {
                    interestRate = 0.06;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 60 && noOfDays > 45) {
                    interestRate = 0.075;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 184 && noOfDays >= 61) {
                    interestRate = 0.08;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else if (noOfDays <= 365 && noOfDays >= 185) {
                    interestRate = 0.085;
                    interest = (amount * interestRate * noOfDays) / 360;
                    System.out.println("Interest gained: " + interest);
                } else {
                    System.out.println("Invalid maturity period");
                }
            }

        } else {
            if (noOfDays <= 14 && noOfDays >= 7) {
                interestRate = 0.065;
                interest = (amount * interestRate * noOfDays) / 360;
                System.out.println("Interest gained: " + interest);

            } else if (noOfDays <= 29 && noOfDays >= 15) {
                interestRate = 0.0675;
                interest = (amount * interestRate * noOfDays) / 360;
                System.out.println("Interest gained: " + interest);
            } else if (noOfDays <= 45 && noOfDays >= 30) {
                interestRate = 0.0675;
                interest = (amount * interestRate * noOfDays) / 360;
                System.out.println("Interest gained: " + interest);
            } else if (noOfDays <= 60 && noOfDays > 45) {
                interestRate = 0.08;
                interest = (amount * interestRate * noOfDays) / 360;
                System.out.println("Interest gained: " + interest);
            } else if (noOfDays <= 184 && noOfDays >= 61) {
                interestRate = 0.085;
                interest = (amount * interestRate * noOfDays) / 360;
                System.out.println("Interest gained: " + interest);
            } else if (noOfDays <= 365 && noOfDays >= 185) {
                interestRate = 0.1;
                interest = (amount * interestRate * noOfDays) / 360;
                System.out.println("Interest gained: " + interest);
            } else {
                System.out.println("Invalid maturity period");
            }
        }
    }

}