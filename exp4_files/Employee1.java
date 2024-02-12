import java.io.*;
import java.util.*;

class Emp implements Serializable {
    String name, address, desg;
    int empid;

    Emp(String name, int empid, String address, String desg) {
        this.name = name;
        this.empid = empid;
        this.address = address;
        this.desg = desg;
    }

}

class endoffile implements Serializable {

}

public class Employee1 {
    public static void main(String[] args) {
        String name, address, desg;
        int empid, count = 0;
        Scanner sc = new Scanner(System.in);
        int flag = 0; // for quit menu to appear

        while (true) {
            System.out.println("=============================");
            System.out.println("            Menu             ");
            System.out.println("=============================");
            System.out.println("Select an Option");
            System.out.println("1. Add an employee\n2. Display details of all");

            if (flag == 1)
                System.out.println("3. Quit the Program");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    try {
                        FileOutputStream fout = new FileOutputStream("file.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fout);

                        System.out.println("Enter the number of employee whose details u wnat to add");
                        int n = sc.nextInt();
                        Emp[] emp = new Emp[n];
                        for (int i = 0; i < emp.length; i++) {
                            System.out.println("Enter Emp Name");
                            name = sc.next();
                            System.out.println("Enter Emp id");
                            empid = sc.nextInt();
                            System.out.println("Enter Emp address");
                            sc.nextLine();
                            address = sc.nextLine();
                            System.out.println("Enter Emp designation");
                            desg = sc.nextLine();
                            emp[i] = new Emp(name, empid, address, desg);

                            out.writeObject(emp[i]);
                            count++;
                        }
                        out.flush();
                        out.close();

                        System.out.println("Details Added Successfully");
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    break;
                case 2:

                    try {
                        int i;
                        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
                        Object obj = null;
                        System.out.println("Name\tEmpId\tDesg.   Address");
                        System.out.println("--------------------------------");
                        try {
                            while ((obj = in.readObject()) instanceof endoffile == false) {
                                System.out.println(((Emp) obj).name + "\t" + ((Emp) obj).empid + "\t"
                                        + ((Emp) obj).desg + "\t" + ((Emp) obj).address);
                            }
                        } catch (EOFException e1) {
                            break; // EOF reached.
                        }
                        System.out.println("--------------------------------");
                        in.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.exit(0); // to quit the program
                    break;
                default:
                    System.out.println("Invalid Input");

            }
            flag = 1; // this flag is for quit menu to appear
        }
    }
}
