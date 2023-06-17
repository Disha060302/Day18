package com.assignment;

import javax.sound.sampled.Line;
import java.awt.*;
import java.util.Objects;

public class EqualityOfLines {
    private Point startPoint;
    private Point endPoint;

    public void Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Line otherLine = (Line) obj;
        return startPoint.equals(otherLine.StartPoint) && endPoint.equals(otherLine.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }
}


