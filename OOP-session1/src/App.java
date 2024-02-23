public class App {
    public static void main(String[] args) throws Exception {
      for (int i = 0; i < 9; i += 2) {
        System.out.print(i + " ");
      }
      System.out.println();
      for (int i = 1; i <= 9; i += 2) {
        System.out.print(i + " ");
      }
  
      System.out.println();
      int a = 1;
      int b = 0;
      for (int i = 1; i < 8; i++) {
        a += b;
        System.out.print(a + " ");
        b++;
      }
      System.out.println();
      a = -3;
      b = 2;
      for (int i = 1; i < 8; i++) {
        System.out.print(a + " ");
        a += b;
        b++;
      }
  
      System.out.println();
      a = 0;
      b = 1;
      int c = 1;
      for (int i = 1; i <= 8; i++) {
        System.out.print(c + " ");
        c = a + b;
        a = b;
        b = c;
      }
      System.out.println();
      a = 0;
      b = 1;
      c = 2;
      int d = 0;
      for (int i = 1; i <= 8; i++) {
        System.out.print(a + " ");
        d = a + b + c;
        a = b;
        b = c;
        c = d;
  
      }
  
    }
  }
  