import java.util.Scanner;

public class CheckPowerOf2OrNot {
    public static boolean IsPowerOfTwo(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println(IsPowerOfTwo(n));
        sc.close();
    }
}
