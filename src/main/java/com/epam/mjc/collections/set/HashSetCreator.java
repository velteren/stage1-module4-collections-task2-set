package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        var result = new HashSet<Integer>();
        for (var item: sourceList) {
            if (item % 2 == 0) {
                var tmp = item;
                while (tmp % 2 == 0) {
                    result.add(tmp);
                    tmp /= 2;
                    result.add(tmp);
                }
            } else {
                result.add(item);
                result.add(item * 2);
            }
        }
        return result;
    }
}
