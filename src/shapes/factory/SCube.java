package shapes.factory;

import shapes.Cube;
import shapes.Shape;

public class SCube extends SCreator {
    @Override
    public Shape create() {
        return new Cube();
    }
}
