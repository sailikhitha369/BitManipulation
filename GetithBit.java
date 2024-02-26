import java.util.Scanner;

public class GetithBit {
    public static int GetIthBitMethod(int n,int i){
        int BitMask=1<<i;
        if((n&BitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter index : ");
        int i=sc.nextInt();
        int Result=GetIthBitMethod(n,i);
        System.out.println(Result);
        sc.close();
    }
}

