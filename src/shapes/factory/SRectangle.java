package shapes.factory;

import shapes.Rectangle;
import shapes.Shape;

public class SRectangle extends SCreator {
    @Override
    public Shape create() {
        return new Rectangle();
    }
}
