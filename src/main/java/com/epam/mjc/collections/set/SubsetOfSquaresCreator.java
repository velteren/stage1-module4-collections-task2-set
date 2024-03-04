package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        var tree = sourceList.stream().map(i -> i * i).collect(Collectors.toCollection(TreeSet::new));
        return tree.subSet(lowerBound, upperBound + 1);
    }
}
