package com.epam.automation.entity.point;

import java.util.Objects;

public class Point {

    private double X_AXIS_COORDINATE;
    private double Y_AXIS_COORDINATE;

    public Point(double x_AXIS_COORDINATE, double y_AXIS_COORDINATE) {
        X_AXIS_COORDINATE = x_AXIS_COORDINATE;
        Y_AXIS_COORDINATE = y_AXIS_COORDINATE;
    }

    public double getX_AXIS_COORDINATE() {
        return X_AXIS_COORDINATE;
    }

    public void setX_AXIS_COORDINATE(double x_AXIS_COORDINATE) {
        X_AXIS_COORDINATE = x_AXIS_COORDINATE;
    }

    public double getY_AXIS_COORDINATE() {
        return Y_AXIS_COORDINATE;
    }

    public void setY_AXIS_COORDINATE(double y_AXIS_COORDINATE) {
        Y_AXIS_COORDINATE = y_AXIS_COORDINATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.X_AXIS_COORDINATE, X_AXIS_COORDINATE) == 0 &&
                Double.compare(point.Y_AXIS_COORDINATE, Y_AXIS_COORDINATE) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X_AXIS_COORDINATE, Y_AXIS_COORDINATE);
    }

    @Override
    public String toString() {
        return "Point{" +
                "X_AXIS_COORDINATE=" + X_AXIS_COORDINATE +
                ", Y_AXIS_COORDINATE=" + Y_AXIS_COORDINATE +
                '}';
    }
}
