package OOPs;

class AccessModifireExample {
  public String name;
  private int pass;
  protected int mobile;

  public int getpassword() {
    return this.pass;
  }

  public void setPassword(int p) {
    this.pass = p;
  }
}

public class AccessModifire {

  public static void main(String[] args) {

    AccessModifireExample aa = new AccessModifireExample();
    aa.name = "arshad";
    aa.mobile = 5847566;
    aa.setPassword(123);
    System.out.println(aa.mobile);
    System.out.println(aa.name);
    System.out.println(aa.getpassword());

  }
}