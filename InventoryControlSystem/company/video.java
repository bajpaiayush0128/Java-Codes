package company;

public class video {
    public String title;
    public boolean checked = true;
    public int rating = 0;

    public boolean checked() {
        return checked;
    }

    public void rent() {
        checked = false;
    }

    public void returned(boolean examine) {
        if (examine)
            System.out.println("Return Successful");
        else
            System.out.println("Return Unsuccessful");
    }

}
