import java.util.Scanner;
public class Uniquedigitcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        boolean seen[]=new boolean[10];
        while(n>0){
            int digit=n%10;
            if(seen[digit]==false){
                seen[digit]=true;
                count++;
            }
            n/=10;
        }
        System.out.println("The unique digits in the given number is: "+count);
    }
}