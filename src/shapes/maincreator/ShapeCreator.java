package shapes.maincreator;

import shapes.*;
import shapes.factory.*;
import shapes.shapeconstants.ShapeConstants;
import static shapes.shapeconstants.ShapeConstants.*;

import java.util.HashMap;

public class ShapeCreator {

    private static HashMap<ShapeConstants, SCreator> factoryData = initFactoryData();

    private static HashMap<ShapeConstants, SCreator> initFactoryData(){
        return new HashMap<ShapeConstants, SCreator>() {{
            put(CUBE, new SCube());
            put(TRIANGLE, new STriangle());
            put(SPHERE, new SSphere());
            put(RECTANGLE, new SRectangle());
        }};
    }

    public static Shape CreateSphere(ShapeConstants style){
        return factoryData.get(style).create();
    }

}
