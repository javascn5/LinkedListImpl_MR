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

        CustomList<String> customList = new CustomLinkedList<>();
        customList.addTail("Jeden");
        customList.addTail("Dwa");
        customList.addTail("Trzy");
        customList.addTail("Cztery");
        customList.addTail("Piec");

        customList.printList();

        customList.find(3);

        customList.printList();
    }
}
