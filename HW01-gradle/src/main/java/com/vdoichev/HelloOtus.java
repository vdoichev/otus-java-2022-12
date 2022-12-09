package com.vdoichev;

import com.google.common.base.Joiner;

public class HelloOtus {
    public static void main(String[] args) {
        String[] greetings = new String[]{"Hello", "OTUS!"} ;
        System.out.println(Joiner.on(", ").join(greetings));
    }
}