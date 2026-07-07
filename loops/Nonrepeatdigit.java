import java.util.Scanner;
public class Nonrepeatdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            System.out.println("Non repeated digit count is: 1");
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
                }
            }
        System.out.println("Non repeated digit count in the given number is: "+count);
    }
}