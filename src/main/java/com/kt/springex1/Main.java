package com.kt.springex1;

import com.kt.springex1.config.Config;
import com.kt.springex1.logic.JavaSort;
import com.kt.springex1.logic.Sort;
import com.kt.springex1.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created By Cheetah on 2022-12-01.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result]" + sortService.doSort(Arrays.asList(args)));
    }
}
