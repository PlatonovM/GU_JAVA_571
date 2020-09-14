package Lesson2_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

    public class Phonebook {
        HashMap<String, HashSet<String>> phonebook;

        public Phonebook() {
            this.phonebook = new HashMap<>();
        }

        public void add(String name, String phone) {
            HashSet<String> book = phonebook.getOrDefault(name, new HashSet<>());
            book.add(phone);
            phonebook.put(name, book);
        }

        public void get(String name) {
            System.out.println(name + " " + phonebook.getOrDefault(name, new HashSet<>()));
        }
    }
