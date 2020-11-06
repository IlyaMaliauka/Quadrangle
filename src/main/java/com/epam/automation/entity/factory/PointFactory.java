package com.epam.automation.entity.factory;

import com.epam.automation.entity.point.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PointFactory {

    private static final Logger logger = LogManager.getRootLogger();

    //generates a Point using data from a file starting from desiredLine
    public static Point generatePoint(int desiredLine) throws IOException {
        double coordinate1;
        double coordinate2;
        BufferedReader br = new BufferedReader(new FileReader("D:/coordinates.txt"));
        String X;
        String Y;
        int lineCount = 0;
        while ((X = br.readLine()) != null) {
            lineCount++;
            if (lineCount >= desiredLine) break;
        }
        while ((X = br.readLine()) != null) {
            X = br.readLine();
            if (X.matches("^[0-9]*$") || X.contains(".")) {
                break;
            } else {
                X = br.readLine();
                logger.warn("Incorrect line in .txt file for creating object Point : " + X
                        + ". Coordinates should not contain letters.");
            }
        }
        while ((Y = br.readLine()) != null) {
            Y = br.readLine();
            if (Y.matches("^[0-9]*$") || Y.contains("."))
                break;
            else {
                Y = br.readLine();
                logger.warn("Incorrect line in .txt file for creating object Point : " + Y
                        + ". Coordinates should not contain letters.");
            }
        }

        coordinate1 = Double.parseDouble(X);
        logger.info("Correct line in .txt file for creating object Point : " + coordinate1 + ".");
        coordinate2 = Double.parseDouble(Y);
        logger.info("Correct line in .txt file for creating object Point : " + coordinate2 + ".");

        return new Point(coordinate1, coordinate2);
    }
}
