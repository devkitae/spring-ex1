package com.kt.javaoop.service;

import com.kt.javaoop.logic.JavaSort;
import com.kt.javaoop.logic.Sort;

import java.util.List;

/**
 * Created By Cheetah on 2023-01-02.
 */
public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
