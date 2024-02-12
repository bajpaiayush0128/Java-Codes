import company.video;
import java.util.*;

public class InventoryStore extends video {
    Scanner sc = new Scanner(System.in);

    video[] v = new video[5];
    static int i = 0;

    public void addVideo(String title) {
        v[i] = new video();
        v[i].title = title;
        i++;
        System.out.println(title + " video added successfully");
    }

    public void checkout(String title) {

        if (i == 0) {
            System.out.println("First ask admin to add video");
        } else {
            for (int j = 0; j < i; j++) {
                if (v[j].title.equalsIgnoreCase(title)) {
                    if (v[j].checked()) {
                        v[j].rent();
                        System.out.println("Video is rented");
                    } else {
                        System.out.println("Sorry, Video is not available");
                    }
                }
            }
        }

    }

    public void returnVideo() {
        if (i == 0) {
            System.out.println("You have no video to return");
        } else {
            System.out.println("Enter name of video which u want to return");

            String title = sc.nextLine();
            int flag = 0;

            for (int j = 0; j < i; j++) {
                if (v[j].title.equalsIgnoreCase(title)) {
                    v[j].checked = true;
                    v[j].returned(v[j].checked);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Incorrect Video name! This video is not in your Inventory List");
            }
        }
    }

    public void ListInventory() {
        System.out.println("-->Inventory List<--");
        for (int j = 1; j <= i; j++)
            System.out.println(j + ". " + v[j - 1].title);
    }

    public void receiveRating() {
        if (i == 0) {
            System.out.println("No video available to rate");
        } else {
            for (int j = 0; j < i; j++) {
                System.out.println("Enter the rating for " + v[j].title);
                v[j].rating = sc.nextInt();
                System.out.println("You have successfully rated " + v[j].title);
            }
        }
    }

    public void getrating() {
        if (i > 0) {
            System.out.println("Sr No.\tVideo Name     Ratings");
            for (int j = 1; j <= i; j++) {
                if (v[j - 1].rating == 0) {
                    System.out.println(j + ". \t " + v[j - 1].title + "\t\tNot Available");
                } else {
                    System.out.println(j + ". \t " + v[j - 1].title + " \t\t" + v[j - 1].rating);
                }
            }
        } else {
            System.out.println("Ratings! Not Available");
        }
    }

}
