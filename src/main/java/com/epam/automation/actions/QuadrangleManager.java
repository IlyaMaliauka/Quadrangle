package com.epam.automation.actions;

import com.epam.automation.entity.point.Point;
import com.epam.automation.entity.quadrangle.Quadrangle;
import com.epam.automation.entity.quadrangle.QuadrangleType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class QuadrangleManager {

    private final Logger logger = LogManager.getRootLogger();

    public double getQuadranglePerimeter(Quadrangle quadrangle) {
        logger.info("Perimeter of given Quadrangle is calculated!");
        return quadrangle.getFirstSide() + quadrangle.getSecondSide() + quadrangle.getThirdSide() + quadrangle.getFourthSide();
    }

    public double getQuadrangleArea(Quadrangle quadrangle) {
        double square = 0;
        for (int i = 0; i < quadrangle.getVertices().size() - 1; i++) {

            Point p1 = quadrangle.getVertices().get(i);
            Point p2 = quadrangle.getVertices().get(i + 1);
            square += ((p1.getX_AXIS_COORDINATE() - p2.getX_AXIS_COORDINATE()) * (p1.getY_AXIS_COORDINATE() + p2.getY_AXIS_COORDINATE())) / 2;
        }

        Point p1 = quadrangle.getVertices().get(quadrangle.getVertices().size() - 1);
        Point p2 = quadrangle.getVertices().get(0);
        square += ((p1.getX_AXIS_COORDINATE() - p2.getX_AXIS_COORDINATE()) * (p1.getY_AXIS_COORDINATE() + p2.getY_AXIS_COORDINATE())) / 2;

        logger.info("Area of given Quadrangle is calculated!");
        return Math.abs(square);
    }

    public QuadrangleType getQuadrangleType(Quadrangle quadrangle) {
        if (quadrangle.getFirstSide() == quadrangle.getSecondSide() &&
                quadrangle.getFirstSide() == quadrangle.getThirdSide() &&
                quadrangle.getFirstSide() == quadrangle.getFourthSide() &&
                quadrangle.getFirstDiagonal() == quadrangle.getSecondDiagonal())
            return QuadrangleType.SQUARE;

        if (quadrangle.getFirstSide() == quadrangle.getSecondSide() &&
                quadrangle.getFirstSide() == quadrangle.getThirdSide() &&
                quadrangle.getFirstSide() == quadrangle.getFourthSide())
            return QuadrangleType.RHOMBUS;

        return QuadrangleType.ARBITRARY;
    }
}
