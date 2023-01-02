package com.kt.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created By Cheetah on 2022-12-01.
 */
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }

}
