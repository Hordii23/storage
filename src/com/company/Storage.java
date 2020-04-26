package com.company;

import javax.swing.*;
import java.util.Scanner;
public class Storage<I, S> {
    I i;
    S s;
    Storage(I i1,S s1){
i = i1;
s = s1;
    }

    public S getS() {
        return s;
    }

    public I getI() {
        return i;
    }
}
