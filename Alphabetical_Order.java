import java.util.Scanner;
public class Alphabetical_Order
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        n = s.nextInt();
        String nameOfStudents[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            nameOfStudents[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (nameOfStudents[i].compareTo(nameOfStudents[j])>0) 
                {
                    temp = nameOfStudents[i];
                    nameOfStudents[i] = nameOfStudents[j];
                    nameOfStudents[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(nameOfStudents[i] + ",");
        }
        System.out.print(nameOfStudents[n - 1]);
    }
}


