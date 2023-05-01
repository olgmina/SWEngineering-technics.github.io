class RectangleTest {

    @Test
    void testArea() {
        Rectangle rect = new Rectangle(Color.BLACK, 0, 0, 5, 10);
        assertEquals(50.0, rect.area());
    }

    @Test
    void testToString() {
        Rectangle rect = new Rectangle(Color.BLUE, 2, 3, 4, 5);
        String expected = "Rectangle{w=4.0, h=5.0, color=0x0000ffff, x=2.0, y=3.0}";
        assertEquals(expected, rect.toString());
    }

    @Test
    void testDraw() {
        Rectangle rect = new Rectangle(Color.RED, 10, 20, 30, 40);
        MockGraphicsContext gc = new MockGraphicsContext();
        rect.draw(gc);
        assertEquals(Color.RED, gc.getStroke());
        assertEquals(2.0, gc.getLineWidth());
        assertEquals(10.0, gc.getX());
        assertEquals(20.0, gc.getY());
        assertEquals(30.0, gc.getWidth());
        assertEquals(40.0, gc.getHeight());
        assertEquals(10.0, gc.getArcWidth());
        assertEquals(10.0, gc.getArcHeight());
    }
}

class MockGraphicsContext extends GraphicsContext {
    private Color stroke;
    private double lineWidth;
    private double x;
    private double y;
    private double width;
    private double height;
    private double arcWidth;
    private double arcHeight;

    @Override
    public void setStroke(Color value) {
        this.stroke = value;
    }

    @Override
    public void setLineWidth(double value) {
        this.lineWidth = value;
    }

    @Override
    public void strokeRoundRect(double x, double y, double w, double h, double arcWidth, double arcHeight) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    public Color getStroke() {
        return stroke;
    }

    public double getLineWidth() {
        return lineWidth;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArcWidth() {
        return arcWidth;
    }

    public double getArcHeight() {
        return arcHeight;
    }
}
