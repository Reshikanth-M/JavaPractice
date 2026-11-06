import java.util.ArrayList;
public class oddandcountevenandcount{
    public static void main(String[] args){
        int num=361589;
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        int oddcount=0;
        int evencount=0;
        num=Math.abs(num);
        while(num>0){
            int digit=num%10;
            if(digit%2!=0){
                odd.add(digit);
                oddcount+=1;
            }
            else{
                even.add(digit);
                evencount+=1;
            }
            num/=10;
        }
        int oddres=0;
        for(int i=odd.size()-1;i>=0;i--){
            oddres=oddres*10+odd.get(i);
        }
        int evenres=0;
        for(int i=even.size()-1;i>=0;i--){
            evenres=evenres*10+even.get(i);
        }
        System.out.println(oddres+""+oddcount+""+evenres+""+evencount);
    }
}