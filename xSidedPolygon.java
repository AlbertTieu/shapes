public class xSidedPolygon implements Shape {
    private int sideLength;
    private String color;
    private int sides;
    public xSidedPolygon(String color, int sideLength, int sides) {
        this.color = color;
        this.sideLength = sideLength;
        this.sides = sides;
    }
    
    public double getArea() {
        return ((sideLength*sides)*(sideLength/2*Math.tan(Math.toRadians(180/sides))))/2;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getPerimeter() {
        return sideLength*sides;
    }
}