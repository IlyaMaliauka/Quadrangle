package com.epam.automation;

import com.epam.automation.actions.QuadrangleManager;
import com.epam.automation.entity.factory.PointFactory;
import com.epam.automation.entity.factory.QuadrangleFactory;
import com.epam.automation.entity.point.Point;
import com.epam.automation.entity.quadrangle.Quadrangle;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class QuadrangleTests {

    final QuadrangleManager manager = new QuadrangleManager();
    final Point point = PointFactory.generatePoint(3);
    final Quadrangle testQuadrangle = QuadrangleFactory.generateQuadrangle(1, PointFactory.generatePoint(3),
            PointFactory.generatePoint(6),
            PointFactory.generatePoint(9),
            PointFactory.generatePoint(12));

    @Test
    public void testPointFactoryGeneratesValidPoints() {
        double coordinate1 = point.getX_AXIS_COORDINATE();
        double coordinate2 = point.getY_AXIS_COORDINATE();
        Assert.assertNotEquals(coordinate1, coordinate2);
    }

    @Test
    public void testQuadrangleFactoryGeneratesQuadrangleWithFourVertices() {
        List<Point> vertices = testQuadrangle.getVertices();

        Assert.assertFalse(vertices.isEmpty());
    }

    @Test
    public void testQuadrangleManagerCountsNotEqualAreaAndPerimeter() {
        double perimeter = manager.getQuadranglePerimeter(testQuadrangle);
        double area = manager.getQuadrangleArea(testQuadrangle);

        Assert.assertNotEquals(perimeter, area);
    }

}
