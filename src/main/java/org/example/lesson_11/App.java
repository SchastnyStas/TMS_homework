package org.example.lesson_11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5, 5, 8, 1, 90, 8, 31);
        CollectionUtil collectionUtil = new CollectionUtil();
        System.out.println(collectionUtil.getIntCollectionInfo(list));

        Map<Integer, String> users = new HashMap<>();
        users.put(25, "Алексей");
        users.put(31, "Ирина");
        users.put(22, "Алексей");
        users.put(29, "Мария");
        users.put(21, "Андрей");
        users.put(30, "Ирина");
        users.put(28, "Елена");
        System.out.println(collectionUtil.getUserUniqueNames(users));
        System.out.println(collectionUtil.sortUsersByAge(users));
    }
}
