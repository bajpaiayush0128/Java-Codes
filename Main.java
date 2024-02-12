import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("Age: " + age);
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.next();
        // nextLine for full name
        System.out.println("Name: " + name);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        int result1 = Math.round(1.1F);
        System.out.println(result);

        final float PI = 3.14F;

        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);

        String message = new String("Hello World");
        String message1 = "Hello World" + "!!";
        message1.endsWith("!!");
        System.out.println(message1.endsWith("!!"));
        System.out.println(message1.length());

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(Arrays.toString(numbers));
        // use deepToString for multi-dimentional array

        Date now = new Date();
        now.getTime();
        System.out.println(now);
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        byte myAge = 30;
        byte herAge = myAge;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(herAge);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(letter);
        System.out.println(isEligible);
    }
}
