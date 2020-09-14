package Lesson2_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Book {
    HashMap<String, HashSet<String>> book;

    public Book() {
        this.book = new HashMap<>();
    }

    static void add(String name, String numbersPhone) {
        Map<String, String> map;
        map = new HashMap<String, String>();
        map.put(name, numbersPhone);
//        System.out.println(map);
    }

    //
    public Set<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        }
        return new HashSet<>();
    }
}