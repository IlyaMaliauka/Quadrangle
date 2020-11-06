package com.epam.automation.actions;

import com.epam.automation.entity.point.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointManager {

    private final Logger logger = LogManager.getRootLogger();

    private boolean ifThreePointsLieOnOneLine(Point point1, Point point2, Point point3) {
        if ((point3.getX_AXIS_COORDINATE() - point1.getX_AXIS_COORDINATE()) /
                (point2.getX_AXIS_COORDINATE() - point1.getX_AXIS_COORDINATE()) ==
                (point3.getY_AXIS_COORDINATE() - point1.getY_AXIS_COORDINATE()) /
                        (point2.getY_AXIS_COORDINATE() - point1.getY_AXIS_COORDINATE())) {
            logger.info("Given points do lie on the same line.");
            return true;
        } else {
            logger.info("Given points do not lie on the same line.");
            return false;
        }
    }
}
