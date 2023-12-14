package org.example;

import org.example.commons.aspect.BasicCommonAnnotation;

public class AppBackground {

    @BasicCommonAnnotation
    public void run() {
        System.out.println("Running in background");
    }

}
