public class Recursion {

    static int recursion(int n){
        int result = 0;
        for(int i = 0; i<=n;i++){
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int naturalNumbers = recursion(10);
        System.out.println(naturalNumbers);
    }
}
