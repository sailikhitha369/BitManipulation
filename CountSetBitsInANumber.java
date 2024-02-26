import java.util.Scanner;

public class CountSetBitsInANumber {
    public static int CountSetBitsInANumberMethod(int n){
    int count=0;
    while(n>0){
        if((n&1)!=0){
           count++;
        }
        n=n>>1;
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        int Result=CountSetBitsInANumberMethod(n);
        System.out.println(Result);
        sc.close();
    }
}
