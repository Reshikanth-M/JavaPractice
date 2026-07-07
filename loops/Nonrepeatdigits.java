import java.util.Scanner;
public class Nonrepeatdigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        System.out.println("The non repeated digits are: ");
        if(n==0){
            System.out.println(1);
            return;
        }
        int frequency[]=new int[10];
        while(n>0){
            int digit=n%10;
            frequency[digit]+=1;
            n/=10;
        }
        for(int i=0;i<frequency.length;i++){
                if(frequency[i]==1){
                    count+=1;
                    System.out.println(i);
                }
            }
        System.out.println("Non repeated digit count in the given number is: "+count);
    }
}