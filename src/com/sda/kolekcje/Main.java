package com.sda.kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Jan");
        list.add("Jacek");
        list.add("Michal");

        for(String l: list){
            System.out.println(l);
        }
    }
}
