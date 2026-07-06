import java.util.Scanner;
public class Digitcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            System.out.println("The count is: 1");
            return ;
        }
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println("The number of digits in the number is: "+count);
    }
}