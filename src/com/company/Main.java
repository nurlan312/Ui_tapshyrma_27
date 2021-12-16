package com.company;

import javax.swing.plaf.InsetsUIResource;

public class Main {

    public static void main(String[] args) {
//         Box box = new Box(12, 6, 20);
//         System.out.println(box.methodBox(box));
        
        Box<Integer, Integer, Integer> box = new Box<>(12, 6, 20);
        System.out.println(java.util.Optional.ofNullable(box.methodBox(box)));
    }
}
