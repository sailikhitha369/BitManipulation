import java.util.Scanner;

public class UpdateIthBit{
    public static int  ClearIthBitMethod(int n,int i){
        int BitMask=~(1<<i);
        return n&BitMask;
    }
        public static int  SetIthBitMethod(int n,int i){
            int BitMask=1<<i;
            return n|BitMask;
    }
    public static int UpdateIthBitMethod(int n,int i,int NewBit){
        if(NewBit==0){
            return SetIthBitMethod(n, NewBit);
        }
        else{
            return ClearIthBitMethod(n, NewBit);
        }

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




