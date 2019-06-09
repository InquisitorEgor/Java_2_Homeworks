package ThirdHomewrok;


import java.util.*;

public class Directory {
    Map<String, List<String>> hm = new HashMap<>();
    List<String> list;

    public void add(String name, String number) {
        if (hm.containsKey(name)) {
            list = hm.get(name); //reference to added number
            list.add(number);
            hm.put(name, list);
        } else {
            list = new LinkedList<>();
            list.add(number);
            hm.put(name, list);
        }
    }

    public List<String> get(String name) {
        return hm.get(name);
    }
}