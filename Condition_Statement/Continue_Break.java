package Condition_Statement;

public class Continue_Break {
    public static  void main(String [] args){
        for(int i=1;i<=10;i++){
            if(i == 3) continue;
            if(i == 7)break;
            System.out.println(i);
        }
    }
}
