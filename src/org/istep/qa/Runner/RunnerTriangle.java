package org.istep.qa.Runner;

import org.istep.qa.Para.Triangle;

public class RunnerTriangle {
    public static void main (String[]args){
        Triangle triangle = new Triangle();
        triangle.getMultiple(1,2,3);
        triangle.getMultiple(1,2.3,3.3);
        triangle.getMultiple(1.1,2.1,3.3);
        triangle.getMultiple(2,4);
    }
}
