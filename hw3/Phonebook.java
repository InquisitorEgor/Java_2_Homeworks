package hw3;

import java.util.*;

public class Phonebook {

    private Map<String, List<String>> hm = new HashMap<>();
    private List<String> list;
    private Iterator<String> iter;


    public void add(Person p1) {
        if (hm.containsKey(p1.surname)) {
            list = hm.get(p1.surname);
            list.add(p1.telephoneNumber);
            list.add(p1.email);
            hm.put(p1.surname, list);
        } else {
            list = new LinkedList<>();
            list.add(p1.telephoneNumber);
            list.add(p1.email);
            hm.put(p1.surname, list);
        }
    }

    public List<String> getFullInformation(String surname) {
        return hm.get(surname);

    }

    public List<String> findTelephone(String surname) {
        list = new LinkedList<>();
        list.addAll(hm.get(surname));
        iter = list.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.next();
            iter.remove();
        }
        return list;
    }

    public List<String> findEmail(String surname) {
        list = new LinkedList<>();
        list.addAll(hm.get(surname));
        iter = list.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
            iter.next();
        }
        return list;
    }
}
