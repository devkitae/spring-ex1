package com.kt.springex1.logic;

import java.util.List;

/**
 * Created By Cheetah on 2023-01-02.
 */
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
