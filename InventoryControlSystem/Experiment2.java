import java.util.*;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryStore inv = new InventoryStore();
        int flag = 0;

        while (true) {
            System.out.println("=============================");
            System.out.println("            Menu             ");
            System.out.println("=============================");
            System.out.println("Do you want to continue as ");
            System.out.println("1. Admin\n2. User");

            if (flag == 1)
                System.out.println("3. Quit the Program");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("1. Add Video \n2. List Inventory\n3. See Video Rating");
                    System.out.println("Enter your choice");
                    int in = sc.nextInt();

                    switch (in) {
                        case 1:
                            System.out.println("Enter name of video");
                            sc.nextLine();
                            String name = sc.nextLine();
                            inv.addVideo(name);
                            break;

                        case 2:
                            inv.ListInventory();
                            break;

                        case 3:
                            inv.getrating();
                            break;

                        default:
                            System.out.println("Invalid Input");
                    }

                    break;
                case 2:
                    System.out.println(
                            "1. List Inventory\n2. Rent video\n3. Enter the rating of the video\n4. Return video\n5. See Video Rating");
                    System.out.println("Enter your choice");
                    int input = sc.nextInt();

                    switch (input) {
                        case 1:
                            inv.ListInventory();
                            break;

                        case 2:
                            System.out.println("Enter name of video to be rented");
                            sc.nextLine();
                            String name = sc.nextLine();
                            inv.checkout(name);
                            break;

                        case 3:
                            inv.receiveRating();
                            break;

                        case 4:
                            inv.returnVideo();
                            break;

                        case 5:
                            inv.getrating();
                            break;

                        default:
                            System.out.println("Invalid Input");
                    }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input");
            }

            flag = 1;
        }
    }
}
