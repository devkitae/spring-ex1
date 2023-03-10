package com.kt.springex1.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created By Cheetah on 2022-12-01.
 */
class JavaSortTest {

    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보내준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

        //then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);

    }

}