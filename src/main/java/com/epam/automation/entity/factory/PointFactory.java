package com.epam.automation.entity.factory;

import com.epam.automation.entity.point.Point;
import com.epam.automation.service.LineParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointFactory {

    private static final Logger logger = LogManager.getRootLogger();

    public static Point generatePoint(int desiredLine){
        return new Point(LineParser.filterAndParseLine(desiredLine), LineParser.filterAndParseLine(desiredLine+1));
    }
}
