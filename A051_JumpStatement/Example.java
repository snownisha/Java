package A051_JumpStatement;

public class Example {
    public static void main (String args[]){
        int i;
      for (i=0; i<10;i++) {
          if(i%2==0 || i%3==0)continue;
          System.out.println(i);
      }
    }
}
