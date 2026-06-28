package Exception_Handling;

public class First_try_catch {
    public static void main(String[] args){
        try{
            int n = 10 / 3;
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("Exception is Call");
        }
    }
}
