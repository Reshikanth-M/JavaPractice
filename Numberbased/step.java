import java.util.ArrayList;
public class step{
    public static void main(String[] args){
        int num=8987;
        ArrayList<Integer>step=new ArrayList<>();
        while(num>0){
            int digit=num%10;
            step.add(digit);
            num/=10;
        }
        boolean s=true;
        for(int i=step.size()-1;i>0;i--){
            if(Math.abs(step.get(i)-step.get(i-1))==1){
                continue;
            }
            else{
                s=false;
                break;
            }
        }
        if(s){
            System.out.println("step");
        }
        else{
            System.out.println("not step");
        }
    }
}