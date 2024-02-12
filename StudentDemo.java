import java.util.Scanner;

interface Student
{
void Grade();
void Atten();
}


class PG_Student implements Student
{
String name, grade;
int m1, m2, m3, attendence, total;
PG_Student(String name, int m1, int m2, int m3, int attendence)
{
this.name = name;
this.m1 = m1;
this.m2 = m2;
this.m3 = m3;
this.attendence = attendence;
}
void Display()
{
System.out.println("Name is " + name);
System.out.println("Marks are " + m1 + " " + m2 + " " + m3);
}
public void Atten()
{
System.out.println("The attendence is " + attendence);
}
public void Grade()
{
total = m1 + m2 + m3;
if (total > 250)
{
grade = "A";
}
else if (total < 250)
{
grade = "B";
} else if (total < 200)
{
grade = "C";
}
else
{
grade = "D";
}
System.out.println("The Grade is " + grade);
}
}


class UG_Student implements Student
{
String name, grade;
int m1, m2, m3, attendence, total;
UG_Student(String name, int m1, int m2, int m3, int attendence)
{
this.name = name;
this.m1 = m1;
this.m2 = m2;
this.m3 = m3;
this.attendence = attendence;
}
void Display()
{
System.out.println("Name is " + name);
System.out.println("Marks are " + m1 + " " + m2 + " " + m3);
}
public void Atten()
{
System.out.println("The attendence is " + attendence);
}
public void Grade()
{
total = m1 + m2 + m3;
if (total > 300)
{
grade = "A+";
}
else if (total > 250)
{
grade = "A";
}
else if (total < 250)
{
grade = "B";
}
else if (total < 200)
{
grade = "B+";
}
else
{
grade = "C";
}
System.out.println("The Grade is " + grade);
}
}
public class StudentDemo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your username");
    String name = sc.nextLine();
    System.out.println("Enter your marks 1");
    int m1 = sc.nextInt();
    System.out.println("Enter your marks 2");
    int m2 = sc.nextInt();
    System.out.println("Enter your marks 3");
    int m3 = sc.nextInt();
    System.out.println("Enter your attendence");
    int attend = sc.nextInt();
    // "Alex", 45, 68, 47, 35
PG_Student pg = new PG_Student(name,m1,m2,m3,attend);
pg.Display();
pg.Atten();
pg.Grade();
// "Aman", 95, 88, 77, 25
UG_Student ug = new UG_Student(name,m1,m2,m3,attend);
ug.Display();
ug.Atten();
ug.Grade();
}
}