package com.kt.springex1.service;

import com.kt.springex1.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created By Cheetah on 2023-01-02.
 */class SortServiceTest {

     private SortService sut = new SortService(new JavaSort<>());

     @Test
    void test() {
         //Given

         //When
         List<String> actual = sut.doSort(List.of("3", "2", "1"));
         //Then
         assertEquals(List.of("1","2","3"), actual);
     }
  
}