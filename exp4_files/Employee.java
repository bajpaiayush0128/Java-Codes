import java.io.*;
import java.util.Scanner;

public class Employee implements Serializable {
    private static int id;
    private static String name;
    private static String desg;
    private static double salary;

    public Employee(int id, String name, String desg, double salary) {
        Employee.id = id;
        Employee.name = name;
        Employee.desg = desg;
        Employee.salary = salary;
    }

    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            boolean z = true;
            while (z) {
                System.out.println("=============================");
                System.out.println("            Menu             ");
                System.out.println("=============================");
                System.out.println("Select an Option");
                System.out.println("1. Add an employee\n2. Display details of all\n3. Quit the Program");

                System.out.println("Enter your choice");
                int ch = sc.nextInt();
                FileOutputStream fout = null;
                ObjectOutputStream out = null;

                switch (ch) {
                    case 1:
                        try {
                            System.out.println("Enter Emp ID");
                            id = sc.nextInt();
                            System.out.println("Enter Emp Name");
                            sc.nextLine();
                            name = sc.nextLine();
                            System.out.println("Enter Emp Designation");
                            desg = sc.nextLine();
                            System.out.println("Enter Emp Salary");
                            salary = sc.nextInt();

                            Employee e1 = new Employee(id, name, desg, salary);

                            fout = new FileOutputStream("file.txt", true);
                            out = new ObjectOutputStream(fout);
                            out.writeObject(e1);
                            out.flush();

                            System.out.println("Employee data submitted successfully!");
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                            out.close();
                            fout.close();
                        }

                        break;

                    case 2:
                        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));

                        try {
                            Object obj = null;
                            while ((obj = in.readObject()) != null) {
                                if (obj instanceof Employee) {
                                    System.out.println(
                                            Employee.id + " " + Employee.name + " " + Employee.desg + " "
                                                    + Employee.salary);
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        in.close();

                        break;

                    case 3:

                    case 4:
                        z = false;

                }

            }
        }
    }
}

class AppendingObjectOutputStream extends ObjectOutputStream {

    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // do not write a header, but reset:
        // this line added after another question
        // showed a problem with the original
        reset();
    }

}