package section.one.two.rectangle;

import java.awt.*;

/**
 * http://docs.oracle.com/javase/tutorial/java/javaOO/QandE/objects-answers.html
 */

public class RectangleFixed {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect);
    }
}
