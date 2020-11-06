package com.epam.automation.service;


import com.epam.automation.entity.point.Point;

public class LineSizeCounter {
    public static double findLengthBetweenPoints(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX_AXIS_COORDINATE() - p2.getX_AXIS_COORDINATE(), 2)
                + Math.pow(p1.getY_AXIS_COORDINATE() - p2.getY_AXIS_COORDINATE(), 2));
    }
}
