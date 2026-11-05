import java.util.ArrayList;
public class oddsumanddigit{
    public static void main(String[] args){
        int num= 361589;
        int sum=0;
        ArrayList<Integer>n=new ArrayList<>();
        while(num>0){
            int digit=num%10;
            if(digit%2!=0){
                sum+=digit;
            }
            else{
                n.add(digit);
            }
            num/=10;
        }
        int format=0;
        for(int i=n.size()-1;i>=0;i--){
            format=format*10+n.get(i);
        }
        System.out.println(sum+""+format);
    }
}