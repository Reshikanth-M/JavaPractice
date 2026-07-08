import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println("The reversed number is: "+rev);
        if(original==rev){
            System.out.println("It is a Palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
    }
}