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
        digitList = new ArrayList<>();
        for(int mod=10; num!=0; num=num/10 ){
            int remainder=num%mod;
            digitList.add(0,remainder);
        }
        if (digitList.size()==0){digitList.add(0);
    }
    }
//    public boolean isStrictlyIncreasing()
//    {
//        //implemented in part (b)
//    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
