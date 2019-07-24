package hw3;

import java.util.*;

public class Main {

    private static Map<String, Integer> hm = new HashMap<>();
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        String str = "Advertising companies say advertising is necessary and important " +
                "It informs people about new TV products " +
                "Advertising hoardings in the street make our environment colourful " +
                "And adverts on TV are often funny ";
        wordsList(str, set);
        uniqueWords(str, hm);
        Phonebook ph = new Phonebook();

        Person p1 = new Person("Ivanov","awrfdsm@mail.ru","89340342284");
        Person p2 = new Person("Makarov","fjumum@mail.ru","89123424242");
        Person p3 = new Person("Ivanov","qwesasel@mail.ru","89532352353");
        Person p4 = new Person("Petrov","fhmnjgm@mail.ru","89345434343");

        ph.add(p1);
        ph.add(p2);
        ph.add(p3);
        ph.add(p4);


        System.out.println(ph.findTelephone("Ivanov"));
        System.out.println(ph.findEmail("Petrov"));
    }



    private static void uniqueWords(String str, Map<String, Integer> hm) {
        String[] temp = str.split(" ");

        for (int i = 0; i < temp.length; i++) {

            if (hm.containsKey(temp[i])) {
                hm.put(temp[i], hm.get(temp[i]) + 1);
            } else
                hm.put(temp[i], 1);
        }
        System.out.println(hm);

    }


    private static void wordsList(String str, Set<String> set) {
        set.addAll(Arrays.asList(str.split(" ")));
        System.out.println(set);
    }
}
