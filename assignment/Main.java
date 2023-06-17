package com.assignment;

import javax.sound.sampled.Line;
import java.awt.*;

public class Main {
        public static void main(String[] args) {
            Point point1 = new Point(0, 0);
            Point point2 = new Point(5, 5);
            Point point3 = new Point(0, 0);
            Point point4 = new Point(5, 5);

            Line line1 = new Line(point1, point2);
            Line line2 = new Line(point3, point4);
            Line line3 = new Line(point1, point3);

            System.out.println(line1.equals(line2));
            System.out.println(line1.equals(line3));
        }
    }
}
