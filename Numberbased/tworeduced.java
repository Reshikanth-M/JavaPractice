import java.util.ArrayList;
public class tworeduced{
    public static void main(String[] args){
        int number=7396;
        while(number>=100){
            ArrayList<Integer>diff=new ArrayList<>();
            int previous=0;
            boolean hasprevious=false;
            while(number>0){
                int current=number%10;
                if(hasprevious){
                    int dif=Math.abs(previous- current);
                    diff.add(dif);
                }
                hasprevious=true;
                number/=10;
                previous=current;
            }
            int result=0;
            for(int i=diff.size()-1;i>=0;i--){
                result=result*10+diff.get(i);
            }
            number=result;
        }
        System.out.println(number);
    }
}