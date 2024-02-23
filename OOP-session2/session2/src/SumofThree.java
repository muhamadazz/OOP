public class SumofThree {
    private int a;
    private int b;
    private int c;
    private int d;
    private int maxloop;

    public int Loop(int a,int b,int c, int maxloop){
        this.a = a;
        this.b = b;
        this.c = c;

        for (int i = 1; i <= maxloop; i++) {
            System.out.print(a + " ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
    } 
    
}
