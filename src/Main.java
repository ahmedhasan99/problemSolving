import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "Apple");
        myMap.put("b", "Microsoft");
        myMap.put( "c","Google");
        System.out.println(Arrays.stream(GetValueOfHasMapAndList.getValuesSorted(myMap)).toList());


    }

}