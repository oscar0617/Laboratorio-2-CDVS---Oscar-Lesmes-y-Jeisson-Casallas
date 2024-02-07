package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.RegularShapeType;
import edu.eci.cvds.patterns.shapes.concrete.*;
import main.java.edu.eci.cvds.patterns.concrete.Hexagon;
import main.java.edu.eci.cvds.patterns.concrete.Pentagon;
import main.java.edu.eci.cvds.patterns.concrete.Quadrilateral;
import main.java.edu.eci.cvds.patterns.concrete.Triangle;

public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}
