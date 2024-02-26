import java.util.Scanner;

public class CheckOddEven{
    public static void OddorEven(int n){
        int BitMask=1;
        if((n&BitMask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        OddorEven(n);
        sc.close();
    }
}