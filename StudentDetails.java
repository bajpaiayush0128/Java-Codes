import java.util.Scanner;

class Student {
   int marks[] = new int[3];
   int RollNo;
   String name;
   float total;

   Scanner sc = new Scanner(System.in);

   Student()

   {

      System.out.print("Enter Student Name: ");

      name = sc.nextLine();

      System.out.print("Enter Roll No.: ");

      RollNo = sc.nextInt();

      getmarks();

   }

   void getmarks() {

      System.out.print("Enter marks of Physics: ");

      marks[0] = sc.nextInt();

      System.out.print("Enter marks of Chemistry: ");

      marks[1] = sc.nextInt();

      System.out.print("Enter marks of Maths: ");

      marks[2] = sc.nextInt();

      for (int i = 0; i < 3; i++)

      {

         total += marks[i];

      }

      System.out.println("Total Marks of student " + name + ": " + total);
   }

}

public class StudentDetails {
   public static void main(String[] args) {

      Student s[] = new Student[5];

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      for (int i = 0; i < n; i++)
         s[i] = new Student();

   }
}