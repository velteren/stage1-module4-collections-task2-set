package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set1 = firstSet.stream().filter(secondSet::contains).filter(item -> !thirdSet.contains(item)).collect(Collectors.toSet());
        Set<String> set2 = thirdSet.stream().filter(item -> !firstSet.contains(item) && !secondSet.contains(item)).collect(Collectors.toSet());
        var result = new HashSet<String>(set1);
        result.addAll(set2);
        return result;
    }
}
