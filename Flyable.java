package com.telran.com.lessonTree;

public interface Flyable {

    void fly();
    default void canFly(){
        System.out.println("");
    }
}
