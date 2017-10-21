package br.com.java6.core;

import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> lnkList = new LinkedList<String>();

        lnkList.add("A");

        lnkList.add(0,"B");

        lnkList.set(1,"C");

        System.out.println(lnkList.get(1));

        for(String s:lnkList){
            System.out.println(s);
        }
    }
}