package org.example.lesson_11;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionUtil {
    public Map<Integer, Long> getIntCollectionInfo(List<Integer> list) {
        Set<Integer> uniqueElements = new HashSet<>(list);
        Map<Integer, Long> infoMap = new HashMap<>();
        for (Integer element : uniqueElements) {
            long count = list.stream().filter(x -> x == element).count();
            infoMap.put(element, count);
        }
        return infoMap;
    }

    public List<String> getUserUniqueNames(Map<Integer, String> users) {
        return users.values().stream().distinct().collect(Collectors.toList());
    }

    public Map<Integer, String> sortUsersByAge(Map<Integer, String> users) {
        return new TreeMap<>(users);
    }
}
