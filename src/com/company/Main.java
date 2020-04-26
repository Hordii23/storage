package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Storage<Integer, Box> storage = new Storage<Integer, Box>(26, Box.createVerticalBox().createHorizontalBox());
        int value = storage.getI();
        System.out.println("Значение: " + value);
        Box box = storage.getS();
        System.out.println("Значение: " + box);
    }
}