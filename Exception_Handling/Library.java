package Exception_Handling;

class store{
    public void borrowBook(int booksRequested){
       try{
           int[] books = {101,102,103};
           System.out.println("Books is Number "+books[booksRequested]);
       } catch (Exception e) {
           System.out.println("Books is Not Found");
       } catch (Throwable e) {
           System.out.println("NullPointer Exception ");
       }finally {
           System.out.println("Finally is Execute");
       }
    }
}

public class Library {
    public static void main(String [] args){
      store ss = new store();
      ss.borrowBook(4);
    }
}
