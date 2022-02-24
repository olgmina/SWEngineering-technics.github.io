import shapes.Shape;
import shapes.maincreator.ShapeCreator;
import shapes.shapeconstants.ShapeConstants;
import static shapes.shapeconstants.ShapeConstants.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        ShapeConstants [] constants = new ShapeConstants[]{CUBE, SPHERE, TRIANGLE, RECTANGLE};
        int size = (int)(Math.random() * 20) + 10;
        for(int i = 0; i< size;i++){
            int index = (int)(Math.random() * 4) + 0;
            shapes.add(ShapeCreator.CreateSphere(constants[index]));
        }

        for(Shape shape: shapes){
            shape.drawType();
        }
    }
}
