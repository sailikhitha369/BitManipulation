import java.util.Scanner;

public class UpdateIthBit2 {
    public static int UpdateIthBitMethod(int n,int i,int NewBit){
        int BitMask=NewBit<<i;
        return n|BitMask;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter index : ");
        int i=sc.nextInt();
        System.out.println("Enter new bit: ");
        int NewBit=sc.nextInt();
        int Result=UpdateIthBitMethod(n,i,NewBit);
        System.out.println(Result);
        sc.close();
    }
}

