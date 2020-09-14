package Lesson2_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("one", "two", "three", "four", "five", "one", "two", "five", "one", "two", "five", "one", "two");
        Set<String> unique = new HashSet<String>(words);
        System.out.println(unique.toString());

        for (String key : unique) {
            System.out.println(key + " встречается " + Collections.frequency(words, key)+" раз(а)");
        }

        Phonebook phonebook = new Phonebook();
        phonebook.add("Mike","8-9229-98-02");
        phonebook.add("Kira","8-9229-98-03");
        phonebook.add("John","8-9229-98-04");
        phonebook.get("Mike");

        // Здась неудачная попытка
//       Book.add("Mike","8-9229-98-12");
//       Book.add("Kira","8-9229-98-13");
//       Book.add("John","8-9229-98-14");
//        Book.get("John");
    }
}
