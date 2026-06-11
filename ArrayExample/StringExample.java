package ArrayExample;

import javax.sound.sampled.SourceDataLine;

public class StringExample {
  public static void main(String[] args) {
    String first = "Arhsad";
    String last = "Bagwan";
    String FullName = first + " " + last;
    System.out.println(FullName);
    for (int i = 0; i < FullName.length(); i++) {
      System.out.println(FullName.charAt(i));

      String sentence = "TonyStack";
      String name = sentence.substring(4);
      System.out.println(name);
    }
  }
}
