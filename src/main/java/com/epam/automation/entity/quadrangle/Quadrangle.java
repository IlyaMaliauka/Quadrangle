package com.epam.automation.entity.quadrangle;

import com.epam.automation.entity.point.Point;
import com.epam.automation.service.LineSizeCounter;

import java.util.Arrays;
import java.util.List;

public class Quadrangle {
    private int id;
    private double FirstSide;
    private double SecondSide;
    private double ThirdSide;
    private double FourthSide;
    private double FirstDiagonal;
    private double SecondDiagonal;
    private List<Point> vertices;


    public Quadrangle(int id, Point point1, Point point2, Point point3, Point point4, Point... vertices) {
        this.id = id;
        this.FirstSide = LineSizeCounter.findLengthBetweenPoints(point1, point2);
        this.SecondSide = LineSizeCounter.findLengthBetweenPoints(point2, point3);
        this.ThirdSide = LineSizeCounter.findLengthBetweenPoints(point3, point4);
        this.FourthSide = LineSizeCounter.findLengthBetweenPoints(point4, point1);
        this.FirstDiagonal = LineSizeCounter.findLengthBetweenPoints(point1, point3);
        this.SecondDiagonal = LineSizeCounter.findLengthBetweenPoints(point2, point4);
        this.vertices = Arrays.asList(point1, point2, point3, point4);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFirstSide() {
        return FirstSide;
    }

    public void setFirstSide(double firstSide) {
        FirstSide = firstSide;
    }

    public double getSecondSide() {
        return SecondSide;
    }

    public void setSecondSide(double secondSide) {
        SecondSide = secondSide;
    }

    public double getThirdSide() {
        return ThirdSide;
    }

    public void setThirdSide(double thirdSide) {
        ThirdSide = thirdSide;
    }

    public double getFourthSide() {
        return FourthSide;
    }

    public void setFourthSide(double fourthSide) {
        FourthSide = fourthSide;
    }

    public double getFirstDiagonal() {
        return FirstDiagonal;
    }

    public void setFirstDiagonal(double firstDiagonal) {
        FirstDiagonal = firstDiagonal;
    }

    public double getSecondDiagonal() {
        return SecondDiagonal;
    }

    public void setSecondDiagonal(double secondDiagonal) {
        SecondDiagonal = secondDiagonal;
    }

    public List<Point> getVertices() {
        return vertices;
    }

    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }

}
