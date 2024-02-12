package sem4;

import java.io.*;

public class Employee {

    public static void main(String[] args) throws IOException {

        int i, pos = -1, da = 0, salary, maxSalary = 0;

        char empDes;

        InputStreamReader read = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(read);

        System.out.println("Enter the total no. of employee");

        int n = Integer.parseInt(br.readLine());

        int empid[] = new int[n];

        System.out.println("Enter empid");

        for (i = 0; i < n; i++) {

            empid[i] = Integer.parseInt(br.readLine());

        }

        System.out.println("Enter depName");

        String depName[] = new String[n];

        for (i = 0; i < n; i++) {

            depName[i] = br.readLine();

        }

        System.out.println("Enter empname");

        String empName[] = new String[n];

        for (i = 0; i < n; i++) {

            empName[i] = br.readLine();

        }

        System.out.println("Enter date of birth");

        String dob[] = new String[n];

        for (i = 0; i < n; i++) {

            dob[i] = br.readLine();

        }

        System.out.println("Enter dateJoin");

        String dateJoin[] = new String[n];

        for (i = 0; i < n; i++) {

            dateJoin[i] = br.readLine();

        }

        int basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };

        int hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };

        String desg = null;

        char DesCodes[] = { 'e', 'c', 'r', 'k', 'm', 'e', 'c' };

        int flag = 0;

        for (i = 0; i < n; i++) {

            pos = i;

            if (pos >= 0) {

                empDes = DesCodes[pos];

                switch (empDes) {

                    case 'e':

                        desg = "Engineer";

                        da = 20000;

                        break;

                    case 'c':

                        desg = "Consultants";

                        da = 32000;

                        break;

                    case 'r':

                        desg = "Receptionist";

                        da = 15000;

                        break;

                    case 'k':

                        desg = "Clerk";

                        da = 12000;

                        break;

                    case 'm':

                        desg = "Manager";

                        da = 40000;

                        break;

                }

                salary = basic[pos] + hra[pos];

                if (flag == 0)

                    System.out.println(

                            "Emp id\t\tEmployee Name\t\tDeaprtment\t\tDOB\t\t\tDateOfJoin\t\tDesignation\t\tSalary");

                System.out.println(empid[pos] + "\t\t" + empName[pos] + "\t\t\t" + depName[pos] + "\t\t" + dob[pos]

                        + "\t\t" + dateJoin[pos] + "\t\t" + desg

                        + "\t\t" + salary);

                for (i = 0; i < pos; i++) {

                    if (salary > maxSalary) {

                        maxSalary = salary;

                    }

                }

            }

            flag = 1;

            if (pos == -1) {

                System.out.println("Emp id does not exist");

                return;

            }

        }

        System.out.println("Highest salary among Employees is: " + maxSalary);

    }

}