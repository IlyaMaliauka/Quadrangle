package com.epam.automation.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LineParser {

    private static final Logger logger = LogManager.getRootLogger();

    public static double filterAndParseLine(int linesInFileToSkip) {
        String lineInFile;
        double coordinate;
        try (Stream<String> lines = Files
                .lines(Paths.get("src/test/resources/coordinates.txt"))
                .skip(linesInFileToSkip)) {
            lineInFile = lines.findFirst().get();
            if (lineInFile.matches("^(-?)[0-9.]*")) {
                logger.info("Correct line in .txt file to generate a Point: " + lineInFile);
                coordinate = Double.parseDouble(lineInFile);
                return coordinate;
            } else {
                logger.warn("Incorrect line in .txt file to generate a Point: " + lineInFile + ". Let's try the next line.");
                return filterAndParseLine(linesInFileToSkip + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filterAndParseLine(linesInFileToSkip + 1);
    }
}
