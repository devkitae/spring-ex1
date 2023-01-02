package com.kt.javaoop;

import com.kt.javaoop.logic.BubbleSort;
import com.kt.javaoop.logic.JavaSort;
import com.kt.javaoop.logic.Sort;

import java.util.Arrays;

/**
 * Created By Cheetah on 2022-12-01.
 */
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
