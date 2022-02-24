package shapes.factory;

import shapes.Shape;
import shapes.Sphere;

public class SSphere extends SCreator {
    @Override
    public Shape create() {
        return new Sphere();
    }
}
