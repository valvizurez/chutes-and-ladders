package com.priceline.chutes.config;

import java.beans.BeanProperty;
import java.util.Random;
import java.util.Scanner;

public class AppConfig {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public Random dice() { return new Random ();}
}
