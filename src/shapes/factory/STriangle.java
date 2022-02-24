package shapes.factory;

import shapes.Shape;
import shapes.Triangle;

public class STriangle extends SCreator {
    @Override
    public Shape create() {
        return new Triangle();
    }
}
