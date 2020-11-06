package com.epam.automation.entity.factory;

import com.epam.automation.entity.point.Point;
import com.epam.automation.entity.quadrangle.Quadrangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class QuadrangleFactory {

    private static final Logger logger = LogManager.getRootLogger();

    public static Quadrangle generateQuadrangle(int id, Point point1, Point point2, Point point3, Point point4){
        logger.info("Successfully created new Quadrangle with vertices from .txt file");
        return new Quadrangle(id, point1, point2, point3, point4);
    }
}
