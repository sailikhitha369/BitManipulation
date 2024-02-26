import java.util.Scanner;

public class SetIthBit {
    public static int  SetIthBitMethod(int n,int i){
        int BitMask=1<<i;
        return n|BitMask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter index : ");
        int i=sc.nextInt();
        int Result=SetIthBitMethod(n,i);
        System.out.println(Result);
        sc.close();
    }
}


