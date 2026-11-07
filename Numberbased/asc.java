import java.util.ArrayList;
import java.util.Scanner;
public class asc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        ArrayList<Integer>store=new ArrayList<>();
        while(num>0){
            int digit=num%10;
            store.add(digit);
            num/=10;
        }
        boolean asc=true;
        for(int i=store.size()-1;i>0;i--){
            if(store.get(i)<=store.get(i-1)){
                continue;
            }
           else{
               asc=false;
                break;
            }
        }
        if(asc){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}