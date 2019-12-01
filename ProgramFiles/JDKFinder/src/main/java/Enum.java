import org.omg.PortableInterceptor.INACTIVE;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enum {
    public static final Boolean TRUE = new Boolean(true);
    public enum Seasons{Spring,Summer,Autumn,Winter};

    public static <K, V> HashMap<K, V> newInstance() {
        return new HashMap<K, V>();
    }
//    Map<String, List<String>> m = HashMap.newInstance();

    public static void main(String [] args){


        for(Seasons s : Seasons.values()){
            System.out.println("第"+(s.ordinal()+1)+"个季节: "+s);
        }
        Integer number1 = Integer.getInteger("3");
        Integer number2 = Integer.valueOf("100");
        Calendar calendar = Calendar.getInstance();
        System.out.println("number1: " + number1 +
                "\n" + "number2: " + number2 +
                "\n" + "calendar: " + calendar.toString() +
                "\n" + "TRUE: " + TRUE.compareTo(Boolean.FALSE));
    }


}
