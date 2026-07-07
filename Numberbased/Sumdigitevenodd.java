import java.util.Scanner;
public class Sumdigitevenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                evensum+=digit;
            }
            else{
                oddsum+=digit;
            }
            n/=10;
        }
        System.out.println("Sum of even digits of the given num is: "+evensum);
        System.out.println("Sum of odd digits of the given num is: "+oddsum);
        
    }
}