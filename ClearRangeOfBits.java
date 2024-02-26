import java.util.Scanner;
    public class ClearRangeOfBits {
    public static int  ClearRangeOfBitsMethod(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int BitMask=a|b;
        return n&BitMask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter i index : ");
        int i=sc.nextInt();
        System.out.println("Enter j index : ");
        int j=sc.nextInt();
        int Result=ClearRangeOfBitsMethod(n,i,j);
        System.out.println(Result);
        sc.close();
    }
}
