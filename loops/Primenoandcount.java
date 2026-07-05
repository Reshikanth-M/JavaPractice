import java.util.Scanner;
public class Primenoandcount{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int n1=s.nextInt();
        System.out.println("Enter the ending range: ");
        int n2=s.nextInt();
        int count=0;
        System.out.println("The prime numbers in the given range are: ");
        for(int i=n1;i<=n2;i++){
            boolean isprime=true;
            if(i<2){
                isprime=false;
            }
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                    count++;
                    System.out.println(i+"");
                }
            
        }
        System.out.println("The count is: "+count);
    }
}