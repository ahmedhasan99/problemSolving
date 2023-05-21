import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GetValueOfHasMapAndList {
    public static String[] getValuesSorted(Map<String, String> map) {
        List<String> valueList= new ArrayList<>();
        List<String> sortedKeys= new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        for (String key:sortedKeys
             ) {
            valueList.add(map.get(key));
        }
        String [] result = new String[valueList.size()];
        valueList.toArray(result);
        return result;
    }


}
