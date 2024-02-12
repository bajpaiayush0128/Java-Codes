
public class Av_Of_n_Nos {
    static void avg(int ...arr){
        int average,result=0;
        for(int i: arr){
            result += i;
        }
        average = result/arr.length;
        System.out.println(average);
        
    }

    public static void main(String[] args) {
        avg(2,4,6,8);
    }
}
