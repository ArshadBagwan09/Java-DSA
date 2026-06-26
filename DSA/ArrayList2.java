package DSA;
import java.sql.SQLOutput;
import java.util.*;

public class ArrayList2 {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>(Arrays.asList("Arshad","Abdulhamid","Bagwan"));
        for (String usr : list){
            System.out.print(usr+" ");
        }
    }
}
