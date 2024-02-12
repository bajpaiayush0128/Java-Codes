import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.net.*;

public class Test {
    public static void main(String[] args) {
        
        ArrayList list=new ArrayList();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}