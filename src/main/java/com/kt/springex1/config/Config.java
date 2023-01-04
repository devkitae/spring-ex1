package com.kt.springex1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created By Cheetah on 2023-01-03.
 */
@EnableWebMvc
@ComponentScan("com.kt.springex1")
@Configuration
public class Config {
}
