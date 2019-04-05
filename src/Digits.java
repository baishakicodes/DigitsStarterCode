import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        //implemented in part (a)
        digitList = new ArrayList<Integer>();
        if(num>0){
            int remainder =0;
            while(num>0){
                remainder = num % 10;
                num = num/10;
                digitList.add(0, remainder);
            }
        }
        else if(num==0){
            digitList.add(0);
        }

        //String stringNum = String.valueOf(num);
        //if(num>=0) {
            //for (int i = 0; i < stringNum.length(); i++) {
                //digitList.add(Integer.valueOf(stringNum.substring(i, i+1)));
            //}
        //}
    }
    public boolean isStrictlyIncreasing()
    {
        //implemented in part (b)
        for(int i=0; i<digitList.size()-1; i++){
            if(digitList.get(i)>= digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
