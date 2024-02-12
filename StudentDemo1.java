interface Student {
    void Display_Grade();

    void Display_Atten();
}

class PG_Student implements Student {
    String name, grade;
    int m1, m2, m3, attendence, total;

    PG_Student(String name, int m1, int m2, int m3, int attendence) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.attendence = attendence;
    }

    void Display() {
        System.out.println("Name is " + name);
        System.out.println("Marks are " + m1 + " " + m2 + " " + m3);
    }

    public void Display_Atten() {
        System.out.println("The attendence is " + attendence);
    }

    public void Display_Grade() {
        total = m1 + m2 + m3;
        if (total > 250) {
            grade = "A";
        } else if (total < 250) {
            grade = "B";
        } else if (total < 200) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("The Grade is " + grade);
    }
}

class UG_Student implements Student {
    String name, grade;
    int m1, m2, m3, attendence, total;

    UG_Student(String name, int m1, int m2, int m3, int attendence) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.attendence = attendence;
    }

    void Display() {
        System.out.println("Name is " + name);
        System.out.println("Marks are " + m1 + " " + m2 + " " + m3);
    }

    public void Display_Atten() {
        System.out.println("The attendence is " + attendence);
    }

    public void Display_Grade() {
        total = m1 + m2 + m3;
        if (total > 300) {
            grade = "S";
        } else if (total > 250) {
            grade = "A";
        } else if (total < 250) {
            grade = "B";
        } else if (total < 200) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("The Grade is " + grade);
    }
}

public class StudentDemo1 {
    public static void main(String[] args) {
        PG_Student pg = new PG_Student("Ayush", 45, 68, 47, 35);
        pg.Display();
        pg.Display_Atten();
        pg.Display_Grade();
        UG_Student ug = new UG_Student("Sandesh", 95, 88, 77, 25);
        ug.Display();
        ug.Display_Atten();
        ug.Display_Grade();
    }
}
