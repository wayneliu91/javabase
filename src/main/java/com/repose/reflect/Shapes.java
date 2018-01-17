package com.repose.reflect;

import java.util.Arrays;
import java.util.List;

/**
 * @author 11629
 */
public class Shapes {
    public static void main(String[] args) {
        List<AbstractShape> abstractShapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (AbstractShape abstractShape : abstractShapeList) {
            abstractShape.draw();
        }
    }
}

abstract class AbstractShape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}

class Circle extends AbstractShape {

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends AbstractShape {

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends AbstractShape {
    @Override
    public String toString() {
        return "Triangle";
    }
}